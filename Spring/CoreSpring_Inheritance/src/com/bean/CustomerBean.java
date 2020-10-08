package com.bean;

public class CustomerBean {
private int custId;
private String fname,lname;
private String streetName;
private int flatno,pincode;
public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public int getFlatno() {
	return flatno;
}
public void setFlatno(int flatno) {
	this.flatno = flatno;
}
public String getStreetName() {
	return streetName;
}
public void setStreetName(String streetName) {
	this.streetName = streetName;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}

@Override
	public String toString() {
		
		return "\n CustId:"+custId+"\n First Name:"+fname;
	}
}
