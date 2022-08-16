package com.example.springcollege.CollegeAppSpring.service;

import com.example.springcollege.CollegeAppSpring.model.User;
import com.example.springcollege.CollegeAppSpring.model.enums.EUserRoles;
import com.example.springcollege.CollegeAppSpring.repository.RolesRepository;
import com.example.springcollege.CollegeAppSpring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private RolesRepository rolesRepository;
    public boolean createNewUser(User user) {

        user.setRoles(
                rolesRepository.getByRoleName(EUserRoles.USER.toString())
        );

        user.setPwd(
                passwordEncoder.encode(user.getPwd())
        );

        user = userRepository.save(user);

        return (user != null && user.getUserId() > 0);
    }
}
