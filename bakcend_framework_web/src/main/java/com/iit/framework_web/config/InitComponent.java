package com.iit.framework_web.config;

import com.iit.framework_web.entities.User;
import com.iit.framework_web.store.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitComponent implements CommandLineRunner {
    private final UserRepository userRepository;

    public InitComponent(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) {
        if (this.userRepository.count() == 0) {
            User user = new User("admin", "adminadmin", "admin", "admin", "admin@root.com", User.UserRole.ADMIN);
            this.userRepository.save(user);
        }
    }
}
