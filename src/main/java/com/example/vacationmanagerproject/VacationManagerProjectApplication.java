package com.example.vacationmanagerproject;

import com.example.vacationmanagerproject.dao.UserRepository;
import com.example.vacationmanagerproject.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VacationManagerProjectApplication implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {
        SpringApplication.run(VacationManagerProjectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Inserting Player 2: {}", userRepository.save(new User("Miti0", "Mitko",
                "Dimitar", "Kaloyanov", "CEO")));

    }
}