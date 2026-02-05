package com.example.LaptopService.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminRepository repo;

    public Admin login(String username, String password) {
        return repo.findByUsernameAndPassword(username, password).orElse(null);
    }
}

