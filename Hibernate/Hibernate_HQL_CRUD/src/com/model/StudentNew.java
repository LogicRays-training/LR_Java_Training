package com.model;

public class StudentNew
{
	public int stuid;
	public String stuname;
	public String sturoll;
	public String stuage;
	public String stuschool;
	
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public String getSturoll() {
		return sturoll;
	}
	public void setSturoll(String sturoll) {
		this.sturoll = sturoll;
	}
	public String getStuage() {
		return stuage;
	}
	public void setStuage(String stuage) {
		this.stuage = stuage;
	}
	public String getStuschool() {
		return stuschool;
	}
	public void setStuschool(String stuschool) {
		this.stuschool = stuschool;
	}
	
	
	public StudentNew(){}
	
	public StudentNew(String stuname,String sturoll,String stuage,String stuschool)
	{
		this.stuname=stuname;
		this.sturoll=sturoll;
		this.stuage=stuage;
		this.stuschool=stuschool;
	}
}
