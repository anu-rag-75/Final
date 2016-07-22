package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


@Table(name="CUSTOMER")
@Entity
public class Customer {
	
	public Customer() {
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int custid;

@NotEmpty
	@Size(min=2, max=30) 
    public String name;
     
 
public String email;
  
public int phone;

public String password;


public String confirmpassword;

   
   
	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getConfirmpassword() {
	return confirmpassword;
}

public void setConfirmpassword(String confirmpassword) {
	this.confirmpassword = confirmpassword;
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}


}
