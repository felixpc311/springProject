package com.myApi.springProject.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myApi.springProject.Models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
    public User findByEmailAndPassword(String email, String password);
}
