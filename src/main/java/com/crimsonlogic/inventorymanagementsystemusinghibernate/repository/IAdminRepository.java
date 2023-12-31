package com.crimsonlogic.inventorymanagementsystemusinghibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crimsonlogic.inventorymanagementsystemusinghibernate.entity.Admin;

@Repository
public interface IAdminRepository extends JpaRepository<Admin, Integer>{

}
