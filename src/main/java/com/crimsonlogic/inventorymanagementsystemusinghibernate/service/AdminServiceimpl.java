package com.crimsonlogic.inventorymanagementsystemusinghibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crimsonlogic.inventorymanagementsystemusinghibernate.entity.Admin;
import com.crimsonlogic.inventorymanagementsystemusinghibernate.exceptionhandling.AdminNotFoundException;
import com.crimsonlogic.inventorymanagementsystemusinghibernate.repository.IAdminRepository;

@Service

public class AdminServiceimpl implements IAdminService{
	@Autowired
	private IAdminRepository adminrepo;
	
	@Override
	public List<Admin> viewAllAdmins() {
		return adminrepo.findAll();
	}
	@Override
	public Admin viewAdminById(int AdminId) throws AdminNotFoundException {
		return adminrepo.findById(AdminId).get();
	}

	@Override
	public Admin insertAdmin( Admin admin) {
		return adminrepo.save(admin);
	}

}
