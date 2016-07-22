package DAO;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Customer;
import model.Product;


@Repository
public class CustomerDAOImpl {

	 private static final Logger logger = LoggerFactory.getLogger(CustomerDAOImpl.class);
	 
	    @Autowired
	    private SessionFactory sessionFactory;
	     
	    public void setSessionFactory(SessionFactory sf){
	        this.sessionFactory = sf;
	    }
	    public void addCustomer(Customer c)
	    {
	        Session session = this.sessionFactory.getCurrentSession();
	        session.persist(c);
	        logger.info("Customer saved successfully, Customer Details="+c);
	    }
	 
	  
	   public void updateCustomer(Customer c) {
	        Session session = this.sessionFactory.getCurrentSession();
	        session.update(c);
	        logger.info("Customer updated successfully, Customer Details="+c);
	    }
	 
	   @SuppressWarnings("unchecked")
	   
	    public List<Customer> listcustomer() {
	        Session session = this.sessionFactory.getCurrentSession();
	        List<Customer> customerList = session.createQuery("from Customer").list();
	        for(Customer p : customerList)
	        {
	            logger.info("Customer List::"+p);
	        }
	        return customerList;
	    }
	 
	    
	    public Customer getCustomerById(int id) {
	        Session session = this.sessionFactory.getCurrentSession();      
	        Customer c = (Customer) session.load(Customer.class, new Integer(id));
	        logger.info("Product loaded successfully, Person details="+c);
	        return c;
	    }
	    
	    
	 

	    public void removeCustomer(int id) {
	        Session session = this.sessionFactory.getCurrentSession();
	        Customer p = (Customer) session.load(Customer.class, new Integer(id));
	        if(null != p){
	            session.delete(p);
	        }
	        logger.info("Customer deleted successfully, Customer details="+p);
	    }
	
	
}
