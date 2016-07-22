package controllers;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


import model.Customer;
import DAO.customerServices;
import DAO.productServices;

@EnableWebMvc
@Controller

@RequestMapping("/customer")
public class SignUpController {

	@Autowired
	  public customerServices customerService;
	
	@Qualifier(value="customerService")
public void setPersonService(customerServices cs){
    this.customerService = cs;
}
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String addCustomer(@Valid @ModelAttribute ("customer") Customer c, BindingResult result) {

		if (result.hasErrors()) {
			return "Register";
		} else {
			if(c.getCustid() == 0){
		          //new person, add it
				System.out.println("data is getting inserted");
		          this.customerService.addCustomer(c);
		          System.out.println("data inserted successfully");
		      }else{
		          //existing person, call update
		          this.customerService.updateCustomer(c);
		      }
			System.out.println("not inserting data");
			return "login";
		}

	}

	@RequestMapping(method = RequestMethod.GET)
	public String displayCustomerForm(ModelMap model) {

		model.addAttribute("customer", new Customer());
		
    	
		
		return "Register";

	}
	@RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
	public ModelAndView welcomePage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is welcome page!");
		model.setViewName("hello");
		return model;

	}
	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public ModelAndView adminPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is protected page!");
		model.setViewName("admin");

		return model;

	}

}
