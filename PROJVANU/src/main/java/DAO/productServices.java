package DAO;
import model.Product;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import DAO.productDAOImpl;

 

 
@Service
public class productServices {
     
	@Autowired
    private productDAOImpl productDAO;
 
    public void setPersonDAO(productDAOImpl productDAO) {
        this.productDAO = productDAO;
    }
 
   
    @Transactional
    public void addProduct(Product p) {
        this.productDAO.addProduct(p);
    }
 
  
    @Transactional
    public void updateProduct(Product p) {
        this.productDAO.updateProduct(p);
    }
 
  
    @Transactional
    public List<Product> listProduct() {
        return this.productDAO.listproduct();
    }
 
  
    @Transactional
    public Product getProductById(int id) {
        return this.productDAO.getProductById(id);
    }
 
 
    @Transactional
    public void removeProduct(int id) 
    {
        this.productDAO.removeProduct(id);
    }
 
}



