package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

//@Entity
public class BillGeneration {
	
	
	private String credit;
	private String debit;
	private String paypal;
	private String ccName;
	private String ccNumber;
	private String ccExpiration;
	private String ccCvv;
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}
	public String getDebit() {
		return debit;
	}
	public void setDebit(String debit) {
		this.debit = debit;
	}
	public String getPaypal() {
		return paypal;
	}
	public void setPaypal(String paypal) {
		this.paypal = paypal;
	}
	public String getCcName() {
		return ccName;
	}
	public void setCcName(String ccName) {
		this.ccName = ccName;
	}
	public String getCcNumber() {
		return ccNumber;
	}
	public void setCcNumber(String ccNumber) {
		this.ccNumber = ccNumber;
	}
	public String getCcExpiration() {
		return ccExpiration;
	}
	public void setCcExpiration(String ccExpiration) {
		this.ccExpiration = ccExpiration;
	}
	public String getCcCvv() {
		return ccCvv;
	}
	public void setCcCvv(String ccCvv) {
		this.ccCvv = ccCvv;
	}
	@Override
	public String toString() {
		return "BillGeneration [credit=" + credit + ", debit=" + debit + ", paypal=" + paypal + ", ccName=" + ccName
				+ ", ccNumber=" + ccNumber + ", ccExpiration=" + ccExpiration + ", ccCvv=" + ccCvv + "]";
	}
	
	

}
