package azot.test_my_sql.controllers;

import azot.test_my_sql.Transfer;
import azot.test_my_sql.entity.TransactionForm;
import azot.test_my_sql.repository.ClientRepository;
import azot.test_my_sql.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class TransactionController {

    @Autowired
    private ClientRepository repositoryOfClients;
    @Autowired
    private TransactionRepository repositoryOfTransactions;

    @GetMapping("/transactionForm")
    public String transactForm(Model model) {

        model.addAttribute("transaction", new TransactionForm());
        model.addAttribute("clients", repositoryOfClients.findAll());

        return "transactionForm";
    }

    @PostMapping("/transactionForm")
    public String transactSubmit(TransactionForm transaction,
                                  RedirectAttributes redirect) {

        transaction.setReport(Transfer.send(repositoryOfClients, transaction));

        repositoryOfTransactions.save(transaction);
        redirect.addFlashAttribute("transaction", transaction);

        return "redirect:/transactionForm/result";
    }

    @GetMapping("/transactionForm/result")
    public String resultReport(Model model) {

        model.addAttribute("clients", repositoryOfClients.findAll());

        return "result";
    }

    @GetMapping("/history_transaction")
    public String historyTransactions(Model model) {

        model.addAttribute("transactions", repositoryOfTransactions.findAll());

        return "history_transaction";
    }

    @RequestMapping("/joke")
    public RedirectView localRedirect() {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("http://www.bash.im");
        return redirectView;
    }

}