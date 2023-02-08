package com.example.sql_connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRespository userRespository;

    public String addUser(User user){
        userRespository.save(user);
        return "successful";
    }
    public User getUser(int id){
        User user = userRespository.findById(id).get();
        return user;
    }
    public List<User> allUser(){
    List<User> l=userRespository.findAll();
    return l;
    }
}
