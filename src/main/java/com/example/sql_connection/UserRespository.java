package com.example.sql_connection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRespository extends JpaRepository<User,Integer> {
    // in the brackets we write first is with whom to connect and second one is datatype of primary key

}
