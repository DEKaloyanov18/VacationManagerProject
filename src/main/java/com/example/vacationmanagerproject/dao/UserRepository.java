package com.example.vacationmanagerproject.dao;

import com.example.vacationmanagerproject.model.Team;
import com.example.vacationmanagerproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByNicknameAndPassword(String username, String password);
}