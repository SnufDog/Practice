package azot.test_my_sql.repository;

import azot.test_my_sql.entity.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
    public Client findByAccountNumber(long accountNumber);
    public Client findByLogin(String login);
}