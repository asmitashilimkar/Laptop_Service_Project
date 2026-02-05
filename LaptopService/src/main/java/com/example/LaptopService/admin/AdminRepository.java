package com.example.LaptopService.admin;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Optional<Admin> findByUsernameAndPassword(String username, String password);
}

