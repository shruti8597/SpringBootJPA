package com.example.socialsql.business;

import com.example.socialsql.dbCollection.UserCollection;
import com.example.socialsql.dbRepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserBusiness {
    @Autowired
    public UserRepository userRepository;

    public Optional<UserCollection> findUser(String id){
        return userRepository.findById(id);
    }

    public void insertUser(UserCollection user){
        userRepository.save(user);
    }
}
