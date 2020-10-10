package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bo.PersonBO;
import com.spring.Person;

@Controller
public class MyController {

	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String index()
	{
		return "index";
	}
	
	@RequestMapping(value="/show",method=RequestMethod.GET)
	public String show()
	{
		return "show";
	}
	@RequestMapping(value="/insert1",method=RequestMethod.GET)
	public String insert1()
	{
		return "redirect:/";
	}
	
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String insert(HttpServletRequest request,HttpServletResponse response,ModelMap map)
	{
		Person p=new Person();
		p.setPname(request.getParameter("pname"));
		p.setPaddress(request.getParameter("paddress"));
		ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
		PersonBO pbo=(PersonBO) a.getBean("personBo");
		pbo.insertPerson(p);
		return "show";
	}
	
	@RequestMapping(value="/edit",method=RequestMethod.POST)
	public String edit(HttpServletRequest request,HttpServletResponse response,ModelMap map)
	{
		int id=Integer.parseInt(request.getParameter("id"));
		ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
		PersonBO pbo=(PersonBO) a.getBean("personBo");
		Person p=pbo.getPersonById(id);
		map.addAttribute("p", p);
		return "update";
	}
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update(HttpServletRequest request,HttpServletResponse response,ModelMap map)
	{
		Person p=new Person();
		p.setId(Integer.parseInt(request.getParameter("id")));
		p.setPname(request.getParameter("pname"));
		p.setPaddress(request.getParameter("paddress"));
		ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
		PersonBO pbo=(PersonBO) a.getBean("personBo");
		pbo.updatePerson(p);
		return "show";
	}
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	public String delete(HttpServletRequest request,HttpServletResponse response,ModelMap map)
	{
		int id=Integer.parseInt(request.getParameter("id"));
		ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
		PersonBO pbo=(PersonBO) a.getBean("personBo");
		pbo.deletePerson(id);
		return "show";
	}
}

