package com.example.appconsultoriomysql.repositories;

import com.example.appconsultoriomysql.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {
}
