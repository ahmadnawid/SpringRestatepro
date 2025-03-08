package dev.estate.RestatePro.service;

import dev.estate.RestatePro.model.User;
import dev.estate.RestatePro.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private JWTService jwtService;

    @Autowired
    AuthenticationManager authManager;
    @Autowired
    private UserRepository userRepository;
    public User registerUser(User user) {
        return  userRepository.save(user);
    }

    public String verifyUser(User user) {
        Authentication authentication =
                authManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
        if(authentication.isAuthenticated()) {
            return jwtService.generateToken(user.getUsername());
        } else {
            return "User not authenticated";
        }
    }
}
