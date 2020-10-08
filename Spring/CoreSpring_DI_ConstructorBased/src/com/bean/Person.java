package com.bean;

public class Person {
private int pid;
private String name;
private String mobno;
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
 public Person(int pid,String name,String mobno) {
	 this.pid=pid;
	 this.name=name;
	 this.mobno=mobno;
	
}
}
