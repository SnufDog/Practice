package azot.test_my_sql.entity;

import javax.persistence.*;

public class AutorizationForm {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String Login;
    private String password;

    public AutorizationForm(){};
    public AutorizationForm(String Login, String password) {
        this.Login = Login;
        this.password = password;
    }

    public String getLogin(){
        return Login;
    }
    public String getPassword() {
        return password;
    }

}
