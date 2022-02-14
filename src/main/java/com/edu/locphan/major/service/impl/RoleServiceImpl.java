package com.edu.locphan.major.service.impl;

import com.edu.locphan.major.model.Role;
import com.edu.locphan.major.repository.RoleRepository;
import com.edu.locphan.major.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleRepository roleRepository;

    public List<Role> getAllRole() {
        return roleRepository.findAll();
    }

    public Optional<Role> findRoleById(int id){
        return roleRepository.findById(id);
    }

}
