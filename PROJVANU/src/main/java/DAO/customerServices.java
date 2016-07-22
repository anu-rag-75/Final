package DAO;

import model.Customer;
import model.Product;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



 

 
@Service
public class customerServices {
     
	@Autowired
    private CustomerDAOImpl customerDAO;
 
    public void setPersonDAO(CustomerDAOImpl customerDAO) {
        this.customerDAO = customerDAO;
    }
 
   
   @Transactional
    public void addCustomer(Customer c) {
        this.customerDAO.addCustomer(c);
    }
 
  
    @Transactional
    public void updateCustomer(Customer p) {
        this.customerDAO.updateCustomer(p);
    }
 
  
    @Transactional
    public List<Customer> listcustomer() {
        return this.customerDAO.listcustomer();
    }
 
  
    @Transactional
    public Customer getCustomerById(int id) {
        return this.customerDAO.getCustomerById(id);
    }
 
 
    @Transactional
    public void removeCustomer(int id) 
    {
        this.customerDAO.removeCustomer(id);
    }
 
}


