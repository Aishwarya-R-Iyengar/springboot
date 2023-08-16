package com.crimsonlogic.inventorymanagementsystemusinghibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="admin")
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer adminId;
	
	@Id
	@NotNull
	@Column(name = "adminemail")
	private String adminEmail;
	
	@Id
	@NotNull
	@Column(name="adminname")
	private String adminName;
	
	@Id
	@NotNull
	@Column(name="username")
	private String userName;
	
	@Id
	@NotNull
	@Column(name="adminpassword")
	private String adminPassword;

	public Admin() {
		super();
	}

	public Admin(Integer adminId, String adminEmail, String adminName, String userName, String adminPassword) {
		super();
		this.adminId = adminId;
		this.adminEmail = adminEmail;
		this.adminName = adminName;
		this.userName = userName;
		this.adminPassword = adminPassword;
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminEmail=" + adminEmail + ", adminName=" + adminName + ", userName="
				+ userName + ", adminPassword=" + adminPassword + "]";
	}
}

