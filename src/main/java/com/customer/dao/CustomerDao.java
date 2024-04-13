package com.customer.dao;

import java.util.List;

import com.customer.entity.Customers;

public interface CustomerDao {
 Customers createCustomer(Customers customer);
 List<Customers>getAllCustomers();
 Customers getCustomerById(String customerID);
 void updateCustomer(Customers customer);
 void deleteCustomer(Customers customer);
 

}
