package azot.test_my_sql.repository;

import azot.test_my_sql.entity.TransactionForm;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends CrudRepository<TransactionForm, Long> {

}