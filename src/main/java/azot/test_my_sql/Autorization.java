package azot.test_my_sql;

import azot.test_my_sql.entity.AutorizationForm;
import azot.test_my_sql.entity.Client;
import azot.test_my_sql.repository.ClientRepository;

public class Autorization {

    public static boolean autoriz(AutorizationForm form, ClientRepository repositoryOfClients) {
        Client user = repositoryOfClients.findByLogin(form.getLogin());
        if (user.getPassword() == form.getPassword()) return true;
        else return false;
    }
}
