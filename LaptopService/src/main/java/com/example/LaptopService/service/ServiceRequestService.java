package com.example.LaptopService.service;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.LaptopService.entity.ServiceRequest;
import com.example.LaptopService.repository.ServiceRequestRepository;

@Service
public class ServiceRequestService {

    @Autowired
    private ServiceRequestRepository repo;

    public ServiceRequest save(ServiceRequest request) {
        return repo.save(request);
    }

    public List<ServiceRequest> getAll() {
        return repo.findAll();
    }

    public ServiceRequest updateStatus(Long id, String status) {
        ServiceRequest req = repo.findById(id).orElseThrow();
        req.setStatus(status);
        return repo.save(req);
    }
}




