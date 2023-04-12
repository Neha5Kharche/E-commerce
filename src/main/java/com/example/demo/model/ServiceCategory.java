package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ServiceCategory {
	@Id
	@GeneratedValue
	private Long serviceCategoryId;
	private String serviceCategoryName;
	@Column(length = 1024)
	private String serviceCategoryIcon;
	@Column(length = 1024)
	private String serviceCategoryImage;
	private String vendorId;
	public String getVendorId() {
		return vendorId;
	}
	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
	public Long getServiceCategoryId() {
		return serviceCategoryId;
	}
	public void setServiceCategoryId(Long serviceCategoryId) {
		this.serviceCategoryId = serviceCategoryId;
	}
	public String getServiceCategoryName() {
		return serviceCategoryName;
	}
	public void setServiceCategoryName(String serviceCategoryName) {
		this.serviceCategoryName = serviceCategoryName;
	}
	public String getServiceCategoryIcon() {
		return serviceCategoryIcon;
	}
	public void setServiceCategoryIcon(String serviceCategoryIcon) {
		this.serviceCategoryIcon = serviceCategoryIcon;
	}
	public String getServiceCategoryImage() {
		return serviceCategoryImage;
	}
	public void setServiceCategoryImage(String serviceCategoryImage) {
		this.serviceCategoryImage = serviceCategoryImage;
	}
	@Override
	public String toString() {
		return "ServiceCategory [serviceCategoryId=" + serviceCategoryId + ", serviceCategoryName="
				+ serviceCategoryName + ", serviceCategoryIcon=" + serviceCategoryIcon + ", serviceCategoryImage="
				+ serviceCategoryImage + ", vendorId=" + vendorId + "]";
	}
	

}
