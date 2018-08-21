package azot.test_my_sql.entity;

import javax.persistence.*;


@Entity
@Table(name = "clients")
public class Client {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "FirstName")
    private String firstName;
    @Column(name = "Amount")
    private double amount;
    @Column(name = "AccountNumber")
    private long accountNumber;

    /*ON FUTURE (LOGIN)*/
    private String password;
    public String Login;

    private static long buffNumber = 100001;

    public void sendTo(Client recipient, double amount) {
        this.decAmount(amount);
        recipient.incAmount(amount);
    }

    public Client() {}

    public Client(String firstName, double amount) {
        this.firstName = firstName;
        this.amount = amount;
        accountNumber = buffNumber++;
        //id = buffId++;
    }
    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getPassword() {
        return password;
    }
    public String getLogin() {
        return Login;
    }

    public double getAmount() {
        return amount;
    }

    public void incAmount(double number) {
        amount+=number;
    }

    public void decAmount(double number) {
        amount-=number;
    }

    @Override
    public String toString() {
        return String.format(
                "Client[id=%d, /n firstName='%s', /n amount='%.2f', /n accountNumber='%d']",
                id, firstName, amount, accountNumber);
    }

}