package com.example.sql_connection;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // used by hibernate to decide whose attribute it should take for table creation
@Table(name = "user_info") // defining table name (by default tablename is class name)
public class User {

        @Id // Used to define an attribute as a  foreign key
        private int roll_no;

        private String name;

        private int age;

    public User() {//always make default constructor
    }

    public User(int roll_no, String name, int age) { // good practice to make a constructor with all args
        this.roll_no = roll_no;
        this.name = name;
        this.age = age;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
