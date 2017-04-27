package com.test.learn.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.test.learn.model.Employee;
import com.test.learn.service.CharacterService;

@Controller
@EnableWebMvc
@RequestMapping(value="/Controller1", produces={"application/xml", "application/json"})
public class CharacterController {
	//hi test;
	@Autowired
	private CharacterService characterService;
	
	@RequestMapping(value="/SubmitDetails", method=RequestMethod.POST)
		public ModelAndView getDetails(){
			ModelAndView model=new ModelAndView("Success");
			return model;
			
	}

	
	@RequestMapping(value="/getName", method=RequestMethod.GET)
	public ResponseEntity<String> getDetails1(){
		String name = "siddharth";
		return new ResponseEntity<String>(name, HttpStatus.OK);
		
}

	
	@RequestMapping(value="/getAllName", method=RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<String>> getAllName(){
//	public List<String> ResponseEntity<String> getAllName(){
		List<String> list= new ArrayList<String>();
		list.add("sid");
		list.add("diksha");
		list.add("rohit");
		list.add("mohit");
		
		return new ResponseEntity<List<String>>(list, HttpStatus.OK);
}
     
	@RequestMapping(value="/getDetail", method=RequestMethod.GET)
	public ResponseEntity<String> getDetail(){
		String name = "controller1 hit";
		return new ResponseEntity<String>(name, HttpStatus.OK);
		
}
	@RequestMapping(value="/getCorrectName", method=RequestMethod.GET)
	public ResponseEntity<String> getCorrectName(String name){
	
		String result= characterService.getTheName(name);
		
			return new ResponseEntity<String>(result, HttpStatus.OK);
		
}
	@RequestMapping(value="/getCorrectNames/name/{name}/age/{age}", method=RequestMethod.GET)
	public ResponseEntity<String> getCorrectNames(@PathVariable String name, @PathVariable int age){
	
		String result= characterService.getTheNames(name, age);
		
			return new ResponseEntity<String>(result, HttpStatus.OK);
	
}
	
	@RequestMapping(value="/getAllEmployeeDetails", method=RequestMethod.GET)
	public ResponseEntity<List<Employee>> getEmpNames(){
	
		List<Employee> empList= characterService.getAllEmpNames();
		
			return new ResponseEntity<List<Employee>>(empList, HttpStatus.OK);
	
}
	
	@RequestMapping(value="/getEmployeeDetail/id/{id}", method=RequestMethod.GET)
	public ResponseEntity<Employee> getCorrectNames(@PathVariable String id){
	
		Employee empDetails= characterService.getFullDetail(id);
		
			return new ResponseEntity<Employee>(empDetails, HttpStatus.OK);
}
	@RequestMapping(value="/getInSortedOrder/order/{order}", method=RequestMethod.GET)
	public ResponseEntity<Boolean> deleteEmployee(@PathVariable String order){
	
		Boolean empDetails= characterService.getDEtailInSortedOrder(order);
		
		return new ResponseEntity<Boolean>(empDetails, HttpStatus.OK);
}
}
