package com.edp.web.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.junit.Test;

import com.edp.domain.Customer;
import com.edp.service.CustomerService;
import com.edp.service.impl.CustomerServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class CustomerAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		System.out.println("成功启动");
		return NONE;
	}

	public String find() {
		System.out.println("成功启动find=================");
		// 调用业务层
		CustomerService customerService = new CustomerServiceImpl();
		List<Customer> list = customerService.find();
		// 页面跳转
		ServletActionContext.getRequest().setAttribute("list", list);
		return "findSuccess";
	}
	
	@Test
	public void demotest() {
		System.out.println("成功启动find=================");
		// 调用业务层
		CustomerService customerService = new CustomerServiceImpl();
		List<Customer> list = customerService.find();
		// 页面跳转
		ServletActionContext.getRequest().setAttribute("list", list);
		for (Customer customer : list) {
			System.out.println(customer);
		}
	}
}
