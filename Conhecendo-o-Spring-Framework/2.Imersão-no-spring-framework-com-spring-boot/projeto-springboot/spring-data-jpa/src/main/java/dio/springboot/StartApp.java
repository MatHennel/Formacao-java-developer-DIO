package dio.springboot;

import dio.springboot.model.User;
import dio.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
//        User user = new User();
//        user.setName("Matheus Hennel");
//        user.setUsername("papaicris");
//        user.setPassword("dio222");
//
//        repository.save(user);

//        List<User> users = repository.filtrarPorNome("Matheus");
        List<User> users = repository.findByNameContaining("Matheus");

        for(User u: users){
            System.out.println(u);
        }

//        for(User u: repository.findAll()){
//            System.out.println(u);
//        }
    }
}
