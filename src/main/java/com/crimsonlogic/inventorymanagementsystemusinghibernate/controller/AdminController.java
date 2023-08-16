package com.crimsonlogic.inventorymanagementsystemusinghibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crimsonlogic.inventorymanagementsystemusinghibernate.entity.Admin;
import com.crimsonlogic.inventorymanagementsystemusinghibernate.exceptionhandling.AdminNotFoundException;
import com.crimsonlogic.inventorymanagementsystemusinghibernate.service.IAdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private IAdminService adminService;
	

	@GetMapping("/viewalladmins")
	public List<Admin> viewAllAdmins() {
		return adminService.viewAllAdmins();
	}
	
	@PostMapping("/insertorders")
	public Admin insertAdmin(@RequestBody Admin admin) {
		return adminService.insertAdmin(admin);
	}
	
	 @GetMapping("/getadminsbyid/{adminid}") 
	  public Admin viewAdminsById(@PathVariable("adminid") int adminId) throws AdminNotFoundException{ 
		  return adminService.viewAdminById(adminId); 
	  }

}
