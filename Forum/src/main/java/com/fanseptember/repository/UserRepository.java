package com.fanseptember.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fanseptember.model.User;
public interface UserRepository extends JpaRepository<User, Long> {

}
