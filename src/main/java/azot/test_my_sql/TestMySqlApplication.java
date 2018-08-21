package azot.test_my_sql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestMySqlApplication /*implements CommandLineRunner*/ {

    /*@Autowired
    private ClientRepository repository;*/

    public static void main(String[] args) {
        SpringApplication.run(TestMySqlApplication.class, args);
    }

    /*@Override
    public void run(String... args) {
        repository.save(new Client("Jack", 5000));
        repository.save(new Client("Chloe", 395));
        repository.save(new Client("Kim", 57943));
        repository.save(new Client("David", 1236));
        repository.save(new Client("Michelle", 954));
    }*/
}