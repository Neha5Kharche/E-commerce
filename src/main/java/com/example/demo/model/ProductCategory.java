package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ProductCategory {
	@Id
	@GeneratedValue
	private Long productCategoryId;
	private String productCategoryName;
	@Column(length=1024)
	private String productCategoryIcon;
	@Column(length=1024)
	private String productCategoryImage;
//	private String vendorId;
//	public String getVendorId() {
//		return vendorId;
//	}
//	public void setVendorId(String vendorId) {
//		this.vendorId = vendorId;
//	}
	public Long getProductCategoryId() {
		return productCategoryId;
	}
	public void setProductCategoryId(Long productCategoryId) {
		this.productCategoryId = productCategoryId;
	}
	public String getProductCategoryName() {
		return productCategoryName;
	}
	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}
	public String getProductCategoryIcon() {
		return productCategoryIcon;
	}
	public void setProductCategoryIcon(String productCategoryIcon) {
		this.productCategoryIcon = productCategoryIcon;
	}
	public String getProductCategoryImage() {
		return productCategoryImage;
	}
	public void setProductCategoryImage(String productCategoryImage) {
		this.productCategoryImage = productCategoryImage;
	}
	@Override
	public String toString() {
		return "ProductCategory [productCategoryId=" + productCategoryId + ", productCategoryName="
				+ productCategoryName + ", productCategoryIcon=" + productCategoryIcon + ", productCategoryImage="
				+ productCategoryImage + "]";
	}
	
	
	
}
