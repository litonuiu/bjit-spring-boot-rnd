package com.example.springbootrnd.repository;

import com.example.springbootrnd.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Md. Liton Miah
 * Created on April 04, 2023 at 3:54 PM
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
