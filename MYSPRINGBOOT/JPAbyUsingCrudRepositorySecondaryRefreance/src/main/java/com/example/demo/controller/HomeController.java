package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Employee;
import com.example.demo.servicei.ServiceI;

@Controller
public class HomeController {
	@Autowired
	ServiceI si;
	
	@RequestMapping("/")
	public String indexpg() {
		return "index";
	}
	
	@RequestMapping("/register")
	public String registerpg() {
		return "register";
	}
	@RequestMapping("/reg")
	public String saveData(@ModelAttribute("emp")Employee e) {
		si.savaData(e);
		return "index";
	}
	@RequestMapping("/log")
	   public String logindata(@RequestParam("uname") String un,@RequestParam("pass") String ps,Model m)
	   {
		   System.out.println("This is login Controller");
		   
		   
		   Employee e=si.logincheck(un,ps);
		   if(e!=null)
		   {
			   Iterable<Employee> list=si.getAllData();
			   m.addAttribute("data", list);
			   
			   return "success";
		   }
		   
		   return "login";
	   }
	 @RequestMapping("/edit")
     public String editData(@RequestParam("id") int id,Model m)
     {
    	 Employee s=si.editdata(id);
    	 m.addAttribute("data", s);
    	 return "edit";
     }
     
     
     
     @RequestMapping("/update")
     public String updateData(@ModelAttribute("emp") Employee e,Model m)
     {
    
    		si.savaData(e);

       	 Iterable<Employee> list=si.getAllData();
   		   m.addAttribute("data", list);
   		 	
    	 return "success";
     }
     @RequestMapping("/delete")
 	public String deleteData(@ModelAttribute("emp") Employee e,Model m)
 	{
 		
     	 si.deleteData(e);
     	 
     	 Iterable<Employee> list=si.getAllData();
 		   m.addAttribute("data", list);
 		   
     	 
 		return "success";
 		
 	}
    // @RequestMapping("/add")
	
}
 