package com.edp.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.edp.dao.CustomerDao;
import com.edp.domain.Customer;
import com.edp.utils.HibernateUtils;

/**
 * 
 * @Title: CustomerDaoImpl.java
 * @Package com.edp.dao.impl
 * @author EdPeng
 * @version 创建时间 2020年2月16日
 * @Description Dao层实现类：实现查询所有
 * @version V1.0
 */
public class CustomerDaoImpl implements CustomerDao {

	@Test
	@Override
	public List<Customer> find() {
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();

		List<Customer> list = session.createQuery("from Customer").list();

		tx.commit();
		return list;
	}

}
