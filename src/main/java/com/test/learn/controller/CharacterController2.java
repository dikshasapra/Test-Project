package com.test.learn.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.test.learn.model.Employee;
import com.test.learn.service.CharacterService;

@Controller
@EnableWebMvc
@RequestMapping(value="/Controller2", produces={"application/xml", "application/json"})
public class CharacterController2 {
	
	
	@Autowired
	private CharacterService characterService;
	
	@RequestMapping(value="/getDetail", method=RequestMethod.GET)
	public ResponseEntity<String> getDetail(){
		String name = "controller2 hit";
		return new ResponseEntity<String>(name, HttpStatus.OK);
		
}
	
	@RequestMapping(value="/getName", method=RequestMethod.POST)
	public ResponseEntity<String> getDetails1(){
		String name = "siddharth";
		return new ResponseEntity<String>(name, HttpStatus.OK);
		
}
	
	@RequestMapping(value="/getCorrectNames", method=RequestMethod.POST)
	public ResponseEntity<Employee> getCorrectNames(@RequestBody Employee employee){
	
		Employee empDetails= characterService.getFullDetails(employee);
		
		return new ResponseEntity<Employee>(empDetails, HttpStatus.OK);
	
	}

	@RequestMapping(value="/getDetails", method=RequestMethod.POST)
	public ResponseEntity<String> getDetails(@RequestBody Employee emp){
	
		String result= characterService.getDetail(emp);
		
			return new ResponseEntity<String>(result, HttpStatus.OK);
}
	
	@RequestMapping(value="/getAllName", method=RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<String>> getAllName(){
        List<String> list= new ArrayList<String>();
		list.add("sid");
		list.add("diksha");
		list.add("rohit");
		list.add("mohit");
		
		return new ResponseEntity<List<String>>(list, HttpStatus.OK);
}
}
