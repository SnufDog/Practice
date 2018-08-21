package azot.test_my_sql;

import azot.test_my_sql.entity.Client;
import azot.test_my_sql.entity.TransactionForm;
import azot.test_my_sql.repository.ClientRepository;

public class Transfer {

    public static String send(ClientRepository repositoryOfClients, TransactionForm transaction) {

        Client sender = repositoryOfClients.findByAccountNumber(transaction.getNumberSender());
        Client recipient = repositoryOfClients.findByAccountNumber(transaction.getNumberRecipient());
        double amount = transaction.getAmount();

        if (sender == null) return "такого отправителя не существует";
        else if (recipient == null) return "такого получателя не существует";
            else if (sender.getAmount()< amount) return "недостаточно средств";
                else
                {
                    sender.sendTo(recipient, amount);
                    repositoryOfClients.save(sender);
                    repositoryOfClients.save(recipient);
                    return "перевод успешен";
                }
    }
}
