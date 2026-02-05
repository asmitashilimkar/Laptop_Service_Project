package com.example.LaptopService.reviwe;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {

	List<Review> findAll();
}

