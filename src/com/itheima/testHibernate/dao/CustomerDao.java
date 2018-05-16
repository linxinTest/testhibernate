/**
 * 
 */
package com.itheima.testHibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.itheima.testHibernate.domain.Customer;
import com.itheima.testHibernate.utils.HibernateUtils;

/**
 * @author Administrator
 *
 */
public class CustomerDao {

	public void save(Customer customer) {
		Session session=HibernateUtils.getSession();
		Transaction transaction = session.beginTransaction();
		session.save(customer);
		transaction.commit();
		session.close();
	}
}
