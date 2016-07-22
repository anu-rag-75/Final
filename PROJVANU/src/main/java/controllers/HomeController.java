package controllers;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;

import org.hibernate.Session;
//import org.hibernate.validator.internal.util.logging.Log_.logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import DAO.productDAOImpl;
import DAO.productServices;
import model.Product;

@EnableWebMvc
@Controller
public class HomeController {
	@Autowired
	  public productServices productService;
	
	@Qualifier(value="productService")
  public void setPersonService(productServices ps){
      this.productService = ps;
  }
	
  @RequestMapping("/")
  public String showIndex()
  {
  	return "index";
  }
  
  @RequestMapping("/index")
  public String showIndex1()
  {
  	return "index";
  }
  
  
  @RequestMapping("/signin")
  public String showSignIn()
  {
  	return "signin";
  }

@RequestMapping("/login")
  public String showLogin()
  {
	 
  	return "login";
  }

 
  @RequestMapping("/Register")
  public String showRegister()
  {
  	return "Register";
  }
    
  @RequestMapping("/AddProduct")
  public String addproduct1()
   
   {
		//ModelAndView modelAndView = new ModelAndView("addproduct");

		
     //  modelAndView.addObject("product", new Product());

   	return "AddProduct";
   }

    
 /* //For add and update person both
  @RequestMapping(value= "/AddProduct", method = RequestMethod.GET)
  public String addProduct(@ModelAttribute("product") Product p){
       
      if(p.getId() == 0){
          //new person, add it
          this.productService.addProduct(p);
      }else{
          //existing person, call update
          this.productService.updateProduct(p);
      }
       
      return "/AddProduct";
   } */
  
  @RequestMapping(value="/Products",method=RequestMethod.GET )
  public String listProducts(Model model)
  {
      model.addAttribute("product", new Product());
      model.addAttribute("listProduct", this.productService.listProduct());
      return "/Products";
  }
  
  @RequestMapping("/details/{id}")
  public String getProductById(@PathVariable("id") int id,Model model) 
  {
  	model.addAttribute("product", this.productService.getProductById(id));    
      model.addAttribute("listProduct",this.productService.listProduct());
      return "Products";
  }
  
  @RequestMapping("delete/{id}")
  public String removeProduct(@PathVariable("id") int id)
  {
      this.productService.removeProduct(id);
      return "redirect:/Products";
  }
  
  @RequestMapping("/edit/{id}")
  public String editProduct(@PathVariable("id") int id, Model model)
  {
      model.addAttribute("product", this.productService.getProductById(id));
      model.addAttribute("listProduct", this.productService.listProduct());
      return "editpage";
  }
  
  @RequestMapping(value= "/AddProduct", method = RequestMethod.GET)
  public String addProduct(@ModelAttribute ("product") Product p)
  	
  {
  	if(p.getId()==0)
  	{
  		this.productService.addProduct(p);
  		
  	}
  	else
  	{
          
  	
  		this.productService.updateProduct(p);
  		
  	}
  	return "/AddProduct";
      
  	}

  @RequestMapping(value= "/editpage/{id}", method = RequestMethod.GET)
  public String updateProduct(@PathVariable("id") int id,Model model,Product p)
  	
  {
  	this.productService.updateProduct(p);
  return "editpage";
  }
 
  @RequestMapping(value = "/uploadFile")
  String uploadFileHandler( )
  {
	  return "FileUploadSuccess";
  }
  /*
   * Multipart
   
  @RequestMapping(value = "/uploadFile", method = RequestMethod.GET)
  
  String uploadFileHandler( @RequestParam("file") MultipartFile file) {

      if (!file.isEmpty()) {
          try {
              byte[] bytes = file.getBytes();

              // Creating the directory to store file
              String rootPath = "C:/Users/user/Pictures";
              File dir = new File(rootPath + File.separator + "file");
              if (!dir.exists())
                  dir.mkdirs();

              // Create the file on server
              File serverFile = new File(dir.getAbsolutePath() + File.separator + "file"+".png");
              BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
              stream.write(bytes);
              stream.close();

              logger.info("Server File Location="+ serverFile.getAbsolutePath());

              return "FileUploadSuccess" ;
          } catch (Exception e) {
              return "You failed to upload " ;
          }
      } else {
          return "You failed to upload  because the file was empty.";
      }
  }
*/
  


  
  
		
}

