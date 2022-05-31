package com.spring.service;

//import java.util.List;

import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;

import com.spring.entities.User;
//import com.spring.model.Request;
import com.spring.model.Request;

@Service
public class ServiceLayer {

	
	private RestTemplate restTemplate;

	public User API() {
		// TODO Auto-generated method stub
		System.out.println( "hello");
		String url = "https://jsonplaceholder.typicode.com/todos/1";
		restTemplate = new  RestTemplate();
		return restTemplate.getForObject(url, User.class);

	}

	public String saveData(Request model) {
		
		String url = "https://reqres.in/api/users";
		restTemplate = new  RestTemplate();
		String result=restTemplate.getForObject(url, String.class);
		System.out.println(result);
		return result;
	}

	





	


}
