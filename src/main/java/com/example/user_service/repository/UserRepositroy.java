package com.example.user_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.user_service.model.User;

@Repository
public interface UserRepositroy extends JpaRepository<User,Long> {

}
