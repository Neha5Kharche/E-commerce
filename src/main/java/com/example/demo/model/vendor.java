package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class vendor{
@Id
private String email;
private String vfirstname;
private String vlastname;
private String vdob;
private String vgender;
private long vcontact;
private String vaddress;
private String city;
private String state;
private String zipcode;
private String password;


public String getVfirstname() {
	return vfirstname;
}
public void setVfirstname(String vfirstname) {
	this.vfirstname = vfirstname;
}
public String getVlastname() {
	return vlastname;
}
public void setVlastname(String vlastname) {
	this.vlastname = vlastname;
}
public String getVdob() {
	return vdob;
}
public void setVdob(String vdob) {
	this.vdob = vdob;
}
public String getVgender() {
	return vgender;
}
public void setVgender(String vgender) {
	this.vgender = vgender;
}
public long getVcontact() {
	return vcontact;
}
public void setVcontact(long vcontact) {
	this.vcontact = vcontact;
}
public String getVaddress() {
	return vaddress;
}
public void setVaddress(String vaddress) {
	this.vaddress = vaddress;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getZipcode() {
	return zipcode;
}
public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "vendor [email=" + email + ", vfirstname=" + vfirstname + ", vlastname=" + vlastname + ", vdob=" + vdob
			+ ", vgender=" + vgender + ", vcontact=" + vcontact + ", vaddress=" + vaddress + ", city=" + city
			+ ", state=" + state + ", zipcode=" + zipcode + ", password=" + password + "]";
}



}
