package com.edp.service;

import java.util.List;

import com.edp.domain.Customer;

public interface CustomerService {
	public List<Customer> find();// 业务层也是查询所有数据
}
