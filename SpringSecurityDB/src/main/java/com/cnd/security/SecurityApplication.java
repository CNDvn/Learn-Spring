package com.cnd.security;

import com.cnd.security.user.User;
import com.cnd.security.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SecurityApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SecurityApplication.class, args);
    }

    @Autowired
    UserRepository userRepository;
    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        //khi chạy chương trình
        //insert vào csdl 1 user
        User user = new User();
        user.setUsername("cnd");
        user.setPassword(passwordEncoder.encode("123"));
        userRepository.save(user);
        System.out.println(user);

    }
}
