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
	private String serviceStatus;
	private String serviceDescription;
	private String vendorId;
	
	public String getVendorId() {
		return vendorId;
	}
	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
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
	public String getServiceStatus() {
		return serviceStatus;
	}
	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}
	public String getServiceDescription() {
		return serviceDescription;
	}
	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}
	@Override
	public String toString() {
		return "VendorServiceProvided [serviceId=" + serviceId + ", serviceName=" + serviceName + ", servicePrice="
				+ servicePrice + ", serviceAddress=" + serviceAddress + ", serviceCategory=" + serviceCategory
				+ ", serviceContactNo=" + serviceContactNo + ", serviceImage=" + serviceImage + ", serviceStatus="
				+ serviceStatus + ", serviceDescription=" + serviceDescription + ", vendorId=" + vendorId + "]";
	}
}