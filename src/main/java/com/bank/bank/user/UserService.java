package com.bank.bank.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    Userr user1 = new Userr("1", "John", "Doe", "jhondoe@gmail.com", "123456789","123456789", new ArrayList<String>(Arrays.asList("1","2")));
	Userr user2 = new Userr("2", "Jose", "Ramon", "joseram@gmail.com", "230877kw","699355236", new ArrayList<String>(Arrays.asList("3","4")));
	Userr user3 = new Userr("3", "Periquin", "gonzalez", "pgonzalez@gmail.com", "857429kk","698741235", new ArrayList<String>(Arrays.asList("5","6")));
    
    List<Userr> users = new ArrayList<>(Arrays.asList(user1,user2,user3)) ;
    
    public List<Userr> getAllUsers() {
        return users;
    }

    public Userr getUser(String id) {
        return users.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addUser(Userr user) {
        users.add(user);
    }

    public void updateUser(String id, Userr user) {
        for (int i = 0; i < users.size(); i++) {
            Userr u = users.get(i);
            if (u.getId().equals(id)) {
                users.set(i, user);
                return;
            }
        }
    }

    public Userr login(String email, String password) {
        for (int i = 0; i < users.size(); i++) {
            Userr u = users.get(i);
            if (u.getEmail().equals(email) && u.getPassword().equals(password)) {
                return u;
            }
        }
        return null;
    }
    
}
