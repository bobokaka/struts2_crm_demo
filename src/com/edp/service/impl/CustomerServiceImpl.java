package com.edp.service.impl;

import java.util.List;

import com.edp.dao.CustomerDao;
import com.edp.dao.impl.CustomerDaoImpl;
import com.edp.domain.Customer;
import com.edp.service.CustomerService;

/**
 * 
 * @Title: CustomerServiceImpl.java
 * @Package com.edp.service.impl
 * @author EdPeng
 * @version 创建时间 2020年2月16日
 * @Description 业务层实现
 * @version V1.0
 */
public class CustomerServiceImpl implements CustomerService{

	@Override
	public List<Customer> find() {
		// 调用DAO:目的只需要查询所有数据，因此只需要调用Dao层一个方法即可。
				CustomerDao customerDao = new CustomerDaoImpl();
				return customerDao.find();
	}

}
