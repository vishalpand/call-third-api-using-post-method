package com.spring.controller;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entities.User;
import com.spring.model.Request;
import com.spring.model.ResponseModel;
import com.spring.service.ServiceLayer;

@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private ServiceLayer serviceLayer;
	
    @GetMapping("/getData")
	public User getData()
	{
    	 System.out.println("hello");
    	 return serviceLayer.API();
		 
	}
    
   
    @PostMapping("/usersave")
    public String saveData(@RequestBody Request model)
    {
    	ResponseModel response;
    	String result=serviceLayer.saveData(model);
    	if(result==null)
    		return "Some technical Error";
    	else {
			return result;
		}
    	
    }
    
    
   
}
