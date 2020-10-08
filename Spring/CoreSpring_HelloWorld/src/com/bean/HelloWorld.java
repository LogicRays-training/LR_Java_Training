package com.bean;

public class HelloWorld {
private String msg;

public String getMsg() {
	return msg;
}

public void setMsg(String msg) {
	this.msg = msg;
}

public void init1() {
System.out.println("Initialize the Bean");
}
public void destroy1() {
System.out.println("Destroy the Bean");
}

}
