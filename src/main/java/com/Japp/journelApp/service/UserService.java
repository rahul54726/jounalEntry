package com.Japp.journelApp.service;

import com.Japp.journelApp.Entity.JournalEntry;
import com.Japp.journelApp.Entity.User;
import com.Japp.journelApp.repository.UserRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

//Business logic here
@Component
public class UserService {
    @Autowired
    private UserRepo userRepo;
    public void saveEntry(User user){
        userRepo.save(user);
    }
    public List<User> getAll(){
        return userRepo.findAll();
    }
    public Optional<User> findById(ObjectId myId){
        return userRepo.findById(myId);
    }
    public void deleteById(ObjectId myId){
        userRepo.deleteById(myId);
    }
    public User findByUserName(String userName){
        return userRepo.findByUserName(userName);
    }
}
