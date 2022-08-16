package com.example.springcollege.CollegeAppSpring.service;

import com.example.springcollege.CollegeAppSpring.model.User;
import com.example.springcollege.CollegeAppSpring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class DashboardService {

    @Autowired
    private UserRepository userRepository;

    public User storeUserInfoPerSession(Authentication authentication, HttpSession session) {

        User currentUser = userRepository.readByEmail(authentication.getName());
        session.setAttribute("loggedInUser", currentUser);

        return currentUser;
    }
}
