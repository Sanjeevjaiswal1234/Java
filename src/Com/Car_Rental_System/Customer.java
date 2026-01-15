package Com.Car_Rental_System;

public class Customer {
	
	
	private String customerId;
	
	private String name;
	
	private long phone;
	
	public Customer(String customerId,String name,long phone) {
		this.customerId = customerId;
		this.name=name;
		this.phone=phone;
		
	}
	
	public String  getCustomerId() {
		return customerId;
	}
	public String getName() {
		return name;
	}
	public  long getPhoneNumber() {
		return  phone;
	}
	
    
}
