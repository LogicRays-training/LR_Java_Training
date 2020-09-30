package com.bean;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class Addition extends SimpleTagSupport{
	int a,b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out=getJspContext().getOut();
		int c=getA()+getB();
		out.println("Addition : "+c);
	}
	
	
}
