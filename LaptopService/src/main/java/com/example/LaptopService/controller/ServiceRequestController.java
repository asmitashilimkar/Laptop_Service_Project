package com.example.LaptopService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.LaptopService.entity.ServiceRequest;
import com.example.LaptopService.service.ServiceRequestService;

@RestController
@RequestMapping("/api/service")
@CrossOrigin("*")
public class ServiceRequestController {

    @Autowired
    private ServiceRequestService service;

    @PostMapping("/request")
    public ServiceRequest createRequest(@RequestBody ServiceRequest request) {
        return service.save(request);
    }


    // 2️⃣ Get all service requests
    @GetMapping("/all")
    public List<ServiceRequest> getAllRequests() {
        return service.getAll();
    }

    // 3️⃣ Update status
    @PutMapping("/status/{id}")
    public ServiceRequest updateStatus(@PathVariable Long id,
                                       @RequestParam String status) {
        return service.updateStatus(id, status);
    }
}
