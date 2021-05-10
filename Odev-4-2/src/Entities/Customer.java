package Entities;

import java.util.Date;

import Abstract.Entity;


public class Customer implements Entity{
   private int id;
   private String firstName;
   private String lastName;
   private java.util.Date dateOfBirh;
   private String nationalityId;
   

public Customer() {
		 
   }
   
   
   public Customer(int id, String firstName, String lastName, Date dateOfBirh, String nationalityId) {
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.dateOfBirh = dateOfBirh;
	this.nationalityId = nationalityId;
}

 
   
  
 public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public java.util.Date getDateOfBirh() {
	return dateOfBirh;
}

public void setDateOfBirh(java.util.Date dateOfBirh) {
	this.dateOfBirh = dateOfBirh;
}

public String getNationalityId() {
	return nationalityId;
}

public void setNationalityId(String nationalityId) {
	this.nationalityId = nationalityId;
}


   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
 