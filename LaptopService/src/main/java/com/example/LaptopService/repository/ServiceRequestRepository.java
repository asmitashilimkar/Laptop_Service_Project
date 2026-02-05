package com.example.LaptopService.repository;

import java.util.List;

import com.example.LaptopService.entity.ServiceRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.LaptopService.entity.ServiceRequest;

	public interface ServiceRequestRepository extends JpaRepository<ServiceRequest, Long> {
	


}

