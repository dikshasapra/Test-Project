package com.test.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.test.learn.model.Employee;
import com.test.learn.service.CharacterService;

@Controller
@EnableWebMvc
@RequestMapping(value="/Controller3", produces={"application/xml", "application/json"})
public class CharacterController3 {

	@Autowired
	private CharacterService characterService;
	
	@RequestMapping(value="/setEmployeeDetails", method=RequestMethod.POST)
	public ResponseEntity<Boolean> setEmployee(@RequestBody Employee employee){
	
		Boolean empDetails= characterService.setDetails(employee);
		
		return new ResponseEntity<Boolean>(empDetails, HttpStatus.OK);
	
}
	
	@RequestMapping(value="/deleteEmployeeDetails", method=RequestMethod.POST)
	public ResponseEntity<Boolean> deleteEmployee(@RequestBody Employee employee){
	
		Boolean empDetails= characterService.delDetails(employee);
		
		return new ResponseEntity<Boolean>(empDetails, HttpStatus.OK);
}
	
	@RequestMapping(value="/updateEmployeeDetails", method=RequestMethod.POST)
	public ResponseEntity<Boolean> updateEmployee(@RequestBody Employee employee){
	
		Boolean empDetails= characterService.updateDetails(employee);
		
		return new ResponseEntity<Boolean>(empDetails, HttpStatus.OK);
}
	
	@RequestMapping(value="/readAllEmployeeDetails", method=RequestMethod.POST)
	public ResponseEntity<List<Employee>> getEmpNames(@RequestBody Employee employee){
	
		List<Employee> empList= characterService.readAllEmpNames(employee);
		
			return new ResponseEntity<List<Employee>>(empList, HttpStatus.OK);
	
}
}
