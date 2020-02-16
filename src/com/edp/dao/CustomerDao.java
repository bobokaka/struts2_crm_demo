package com.edp.dao;

import java.util.List;

import com.edp.domain.Customer;

public interface CustomerDao {
	List<Customer> find();//查询所有
}
