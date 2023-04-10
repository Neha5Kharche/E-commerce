package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class VendorServiceProvided {
	
	@Id
	@GeneratedValue
	private Long serviceId;
	private String serviceName;
	private String servicePrice;
	private String serviceAddress;
	private String serviceCategory;
	private String serviceContactNo;
	private String serviceImage;
	public Long getServiceId() {
		return serviceId;
	}
	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getServicePrice() {
		return servicePrice;
	}
	public void setServicePrice(String servicePrice) {
		this.servicePrice = servicePrice;
	}
	public String getServiceAddress() {
		return serviceAddress;
	}
	public void setServiceAddress(String serviceAddress) {
		this.serviceAddress = serviceAddress;
	}
	public String getServiceCategory() {
		return serviceCategory;
	}
	public void setServiceCategory(String serviceCategory) {
		this.serviceCategory = serviceCategory;
	}
	public String getServiceContactNo() {
		return serviceContactNo;
	}
	public void setServiceContactNo(String serviceContactNo) {
		this.serviceContactNo = serviceContactNo;
	}
	public String getServiceImage() {
		return serviceImage;
	}
	public void setServiceImage(String serviceImage) {
		this.serviceImage = serviceImage;
	}
	@Override
	public String toString() {
		return "Service [serviceId=" + serviceId + ", serviceName=" + serviceName + ", servicePrice=" + servicePrice
				+ ", serviceAddress=" + serviceAddress + ", serviceCategory=" + serviceCategory + ", serviceContactNo="
				+ serviceContactNo + ", serviceImage=" + serviceImage + "]";
	}
	
	

}
