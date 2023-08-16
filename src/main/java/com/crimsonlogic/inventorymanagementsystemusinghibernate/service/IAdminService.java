package com.crimsonlogic.inventorymanagementsystemusinghibernate.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crimsonlogic.inventorymanagementsystemusinghibernate.entity.Admin;
import com.crimsonlogic.inventorymanagementsystemusinghibernate.exceptionhandling.AdminNotFoundException;

@Service
public interface IAdminService {

	List<Admin> viewAllAdmins();

	Admin viewAdminById(int AdminId) throws AdminNotFoundException;

	Admin insertAdmin(Admin admin);
	

}
