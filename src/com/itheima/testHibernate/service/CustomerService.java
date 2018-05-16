/**
 * 
 */
package com.itheima.testHibernate.service;

import com.itheima.testHibernate.dao.CustomerDao;
import com.itheima.testHibernate.domain.Customer;

/**
 * @author Administrator
 *
 */
public class CustomerService {
	
	public void save(Customer customer) {
		new CustomerDao().save(customer);
	}

}
