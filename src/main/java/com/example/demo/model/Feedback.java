package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Feedback {
	@Id
	@GeneratedValue
	private Long feedbackId;
	private String customerId;
	
<<<<<<< HEAD
	public String customerName;
	
	

	public String customerFeedback;
	public String getCustomerFeedback() {
		return customerFeedback;
=======
	private String customerName;
	private String customerFeedbackValue;
	private String customerFeedback;
	public Long getFeedbackId() {
		return feedbackId;
>>>>>>> branch 'master' of https://github.com/Neha5Kharche/e-Commerce.git
	}
	public void setFeedbackId(Long feedbackId) {
		this.feedbackId = feedbackId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerFeedbackValue() {
		return customerFeedbackValue;
	}
	public void setCustomerFeedbackValue(String customerFeedbackValue) {
		this.customerFeedbackValue = customerFeedbackValue;
	}
	public String getCustomerFeedback() {
		return customerFeedback;
	}
	public void setCustomerFeedback(String customerFeedback) {
		this.customerFeedback = customerFeedback;
	}
	@Override
	public String toString() {
		return "Feedback [feedbackId=" + feedbackId + ", customerId=" + customerId + ", customerName=" + customerName
				+ ", customerFeedbackValue=" + customerFeedbackValue + ", customerFeedback=" + customerFeedback + "]";
	}
}