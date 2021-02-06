package com.yogesh.repo;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.yogesh.entity.Customer;

public interface CustomerRepo extends CrudRepository<Customer,Serializable>{

}
