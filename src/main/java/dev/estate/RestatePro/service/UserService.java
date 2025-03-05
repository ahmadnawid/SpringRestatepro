package dev.estate.RestatePro.service;

import dev.estate.RestatePro.model.User;
import dev.estate.RestatePro.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User registerUser(User user) {
        return  userRepository.save(user);
    }
}
