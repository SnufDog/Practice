package azot.test_my_sql.entity;

import javax.persistence.*;

@Entity
@Table(name = "transactions")
public class TransactionForm {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "NumberSender")
    private long numberSender;
    @Column(name = "NumberRecipient")
    private long numberRecipient;
    @Column(name = "Amount")
    private double amount;
    @Column(name = "Comment")
    private String comment="";
    @Column(name = "Report")
    private String Report="";

    public TransactionForm() {};
    public TransactionForm(TransactionForm transactionForm) {
        numberSender = transactionForm.numberSender;
        numberRecipient = transactionForm.numberRecipient;
        amount = transactionForm.amount;
        comment = transactionForm.comment;
    }

    public long getId() {
        return id;
    }
    public long getNumberSender() {
        return numberSender;
    }
    public long getNumberRecipient() {
        return numberRecipient;
    }
    public double getAmount() {
        return amount;
    }

    public void setNumberSender(long number) {
        numberSender = number;
    }
    public void setNumberRecipient(long number) {
        numberRecipient = number;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public String getReport() {
        return Report;
    }
    public void setReport(String report) {
        Report = report;
    }
    public String getComment() {
        return comment;
    }
    @Override
    public String toString() {
        return String.format(
                "Transaction[id=%d, /n NumberSender='%d', /n NumberRecipient='%d' , /n amount='%.2f', /n Comment='%s']",
                id, numberSender, numberRecipient, amount, comment);
    }
}