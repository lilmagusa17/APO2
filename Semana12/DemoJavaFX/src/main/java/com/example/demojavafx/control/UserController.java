package com.example.demojavafx.control;

import com.example.demojavafx.model.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class UserController {

    //singleton pattern
    private static UserController instance;

    public static UserController getInstance(){
        if(instance == null){
            instance = new UserController();
        }
        return instance;
    }

    private ObservableList<User> users;

    private UserController() {
        users = FXCollections.observableArrayList();
    }

    public void addUser(String name, String id, int years){
        User user = new User(name, id, years);
        users.add(user);
    }

    public String printUsers(){
        String msj = "";
        for (int i = 0; i < users.size(); i++) {
            msj += users.get(i) + "\n";
        }
        return msj;
    }

    public ObservableList<User> getUsers() {
        users.add(new User("Juan", "123", 20));
        return users;
    }
}
