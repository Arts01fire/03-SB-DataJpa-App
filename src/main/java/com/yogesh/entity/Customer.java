package com.yogesh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="cust")

public class Customer {
	
	@Id
	@Column(name="Cust_Id")
	private Integer CustomerId;
	@Column(name="Cust_Name")
	private String CustomerName;
	@Column(name="Cust_Addr")
	private String CustomerAddress;
	@Column(name="Cust_Bal")
	private double balance;
	
	public Customer() {}
	
	
	
	public Customer(Integer customerId, String customerName, String customerAddress, double balance) {
		
		CustomerId = customerId;
		CustomerName = customerName;
		CustomerAddress = customerAddress;
		this.balance = balance;
	}
	
	
	

}
