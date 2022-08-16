package com.example.springcollege.CollegeAppSpring.repository;

import com.example.springcollege.CollegeAppSpring.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends JpaRepository<Roles,Integer> {
    Roles getByRoleName(String roleName);
}
