package com.bean;

public class Person {
private int pid;
private String name;
private String mobno;
private Phone phone;//instance of Phone class as phone
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMobno() {
	return mobno;
}
public void setMobno(String mobno) {
	this.mobno = mobno;
}
 public Person(int pid,String name,String mobno,Phone phone) {
	 this.pid=pid;
	 this.name=name;
	 this.mobno=mobno;
	 this.phone= phone;
	
}
 public void callPhone() {
	System.out.println("Call Phone");
	phone.call();
	}
}
