package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Feedback {
	@Id
	@GeneratedValue
	public Long feedbackId;
	public String customerId;
	
	public String customerName;
	
	

	public String customerFeedback;
	public String getCustomerFeedback() {
		return customerFeedback;
	}
	public void setCustomerFeedback(String customerFeedback) {
		this.customerFeedback = customerFeedback;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public Long getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(Long feedbackId) {
		this.feedbackId = feedbackId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	@Override
	public String toString() {
		return "Feedback [feedbackId=" + feedbackId + ", customerId=" + customerId + ", customerName=" + customerName
				+ ", customerFeedback=" + customerFeedback + "]";
	}
	

}
