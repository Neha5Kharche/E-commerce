package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Help {
	
	@Id
	@GeneratedValue
	private Long helpId;
	private String customerId;
	private String customerName;
	private String query;
	private String solution;
	public String getSolution() {
		return solution;
	}
	public void setSolution(String solution) {
		this.solution = solution;
	}
	public Long getHelpId() {
		return helpId;
	}
	public void setHelpId(Long helpId) {
		this.helpId = helpId;
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
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	@Override
	public String toString() {
		return "Help [helpId=" + helpId + ", customerId=" + customerId + ", customerName=" + customerName + ", query="
				+ query + ", solution=" + solution + "]";
	}
	
	
	
	
	

}
