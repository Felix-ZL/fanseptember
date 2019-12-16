package com.fanseptember.util;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fanseptember.model.Comment;
import com.fanseptember.model.User;
import com.fanseptember.repository.CommentRepository;
import com.fanseptember.repository.UserRepository;

@Configuration
@Slf4j
class LoadDatabase {

  @Bean
  CommandLineRunner initDatabase(UserRepository repository) {
    return args -> {
     // log.info("Preloading " + repository.save(new User("admin","admin")));
      //log.info("Preloading " + repository.save(new User("test","test")));
    };
  }
}