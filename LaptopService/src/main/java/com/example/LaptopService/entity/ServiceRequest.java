package com.example.LaptopService.entity;


import jakarta.persistence.*;

	@Entity
	@Table(name = "service_requests")
	public class ServiceRequest {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String customerName;
	    private String phone;
	    private String email;
	    private String serviceType;
	    private String description;
	    private String status = "Pending";

	    // Getters & Setters
	    public Long getId() { return id; }
	    public void setId(Long id) { this.id = id; }

	    public String getCustomerName() { return customerName; }
	    public void setCustomerName(String customerName) { this.customerName = customerName; }

	    public String getPhone() { return phone; }
	    public void setPhone(String phone) { this.phone = phone; }

	    public String getEmail() { return email; }
	    public void setEmail(String email) { this.email = email; }

	    public String getServiceType() { return serviceType; }
	    public void setServiceType(String serviceType) { this.serviceType = serviceType; }

	    public String getDescription() { return description; }
	    public void setDescription(String description) { this.description = description; }

	    public String getStatus() { return status; }
	    public void setStatus(String status) { this.status = status; }
	}


