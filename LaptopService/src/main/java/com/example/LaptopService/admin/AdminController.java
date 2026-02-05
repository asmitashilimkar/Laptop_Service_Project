package com.example.LaptopService.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin("*")
public class AdminController {

    @Autowired
    private AdminService service;

    @PostMapping("/login")
    public Admin login(@RequestBody Admin admin) {
        return service.login(admin.getUsername(), admin.getPassword());
    }
}

