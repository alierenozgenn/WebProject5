package com.foy5.foy5.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foy5.foy5.model.User;
import com.foy5.foy5.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findById(Integer id) {
        
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("Kullanıcı bulunamadı"));
    }

    public void updateUser(User user) {
        if (user == null || user.getId() == null) {
            throw new IllegalArgumentException("User ID must not be null");
        }

        if (userRepository.existsById(user.getId())) {
            userRepository.save(user); // If user exists, update it
        } else {
            throw new RuntimeException("User not found for update with ID " + user.getId());
        }
    }
}