package EcommerceApp_Project;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Service {
	
	
	Map<String ,Product> products = new HashMap<>();
	
	Scanner sc = new Scanner(System.in);
	
	
	static {
		System.out.println("Application started !!");

	   }
	{
        products.put("P101", new Shirt("Polo",1999.99, 40 ,"Blue","Full"));
        products.put("P102", new Mobile("Samsung", 15999.99, 6, "Black", 128));
		products.put("P103", new Laptop("Dell", 55999.99, 8, "Silver", 512));
		products.put("P104", new Shirt("Levis", 2499.99, 42, "White", "Half"));
		products.put("P105", new Mobile("Apple", 69999.99, 4, "White", 64));
		products.put("P106", new Laptop("HP", 45999.99, 16, "Black", 1024));
		products.put("P107", new Shirt("Arrow", 2999.99, 38, "Pink", "Full"));
		products.put("P108", new Mobile("OnePlus", 39999.99, 8, "Red", 256));
		products.put("P109", new Laptop("Lenovo", 35999.99, 12, "Grey", 512));
		products.put("P110", new Shirt("Polo", 2999.99, 38, "green", "half"));
	}
	
	
	
	public void start() {
		
		System.out.println("Enter Admin/user :");
		
		String choice = sc.nextLine();
		
		if(choice.equalsIgnoreCase("admin")) {
			
			//admin code
			//validation code for admin 
			
			do {
				adminAccess();
			}while(selectContinue());
			System.out.println("Thank you ! application ends");

		}else {
			if(choice.equalsIgnoreCase("user")) {
				//user code
				// validation code for user
				
				do {
					userAccess();
				}while(selectContinue());
				System.out.println("Thank you ! Application will be ends ele");

			}else {
				System.out.println("Invalid choice ! please select valid options");
                        start();
			}
		}

		
	}


	private boolean selectContinue() {
		System.out.println("Press yes to continue");
		String choice = sc.nextLine();
		
		return choice.equalsIgnoreCase("yes");
	}

	private void userAccess() {
		// TODO Auto-generated method stub
		
	}



	private void adminAccess() {
		System.out.println("press 1 for Access all product");
		System.out.println("press 2 for Add the Product");
		System.out.println("press 3 for Remove the  product from given Product id");
		System.out.println("press 4  for Count all the product");
		System.out.println("press 5  for get Details about the product");
		
		
		int choice = (Integer.parseInt(sc.nextLine()));
		
		switch(choice) {
		  
		case 1:  System.out.println("product List");
		        products.forEach((k,v)->{
		        	System.out.println("Product Id :"+k+"\t"+v);

		        });
		           break;
		           
		case 2: addProduct();
		        break;
		        
		case 3:   System.out.println("Enter the Product Id for Remove");
		          String pid = sc.nextLine();
		          if(products.containsKey(pid)) {
		        	  
		        	  products.remove(pid);
		        	  System.out.println("Product with id "+pid+" is Successfully removed from Products");

		        	  
		          }else {
		        	  
		        	  System.out.println("Such product id "+pid+"is Not found");

		          }
		          break;
		case 4:    
			      countAllProduct();
			     break;
		case 5:
			printAllProductDetails();
			break;
		}
				
	}

	public void printAllProductDetails() {
		Set<String> p=new HashSet<>();
		for(String k:products.keySet()) {
			String n=products.get(k).getClass().getName();
			String name=n.substring(n.lastIndexOf('.')+1);
			p.add(name);
		}
		System.out.println("All Products are: "+p);
		System.out.println("Total products are: "+p.size());
		
	}



	public  void  countAllProduct() {
		 Map<String,Integer> m = new HashMap<>();
		 
		 for(String k:products.keySet()) {
			 
			 
			 String n = products.get(k).getClass().getName();
			 String name= n.substring(n.lastIndexOf('.')+1);
			 int val = m.getOrDefault(name,0);
			 m.put(name,val+1);	 
		 }
		 System.out.println("All Product counts: ");
	     m.forEach((k,v)-> System.out.println(k+" product is: "+v));
		
	}


	

	private void addProduct() {
		
		      System.out.println("Enter the product id");
		      String pid = sc.nextLine();
		      
		      products.put(pid,getProduct())	;      

	}



	public  Product getProduct() {
		                 System.out.println("Press 1 for Shirt");
		                 System.out.println("Press 2 for Mobile");
		                 System.out.println("Press 3 for Laptop");
		                 
		                 int choice = (Integer.parseInt(sc.nextLine()));
		                
		                 switch(choice) {
		                 
		                 case 1:    System.out.println("Enter the Brand");
		                            String sBrand = sc.nextLine();
		                            System.out.println("Enter Price: ");
		            				double sPrice=Double.parseDouble(sc.nextLine());
		                            System.out.println("Enter the size");
		                            int sSize = Integer.parseInt(sc.nextLine());
		                            System.out.println("Enter the color");
		                            String sColor = sc.nextLine();
		                            System.out.println("Enetr the type of shirt Full/Half");
		                            String sType = sc.nextLine();
		                            
		                            return new Shirt(sBrand,sPrice, sSize,sColor,sType);
		                 case 2:    
		                	System.out.println("Enter Brand: ");
		     				String mBrand=sc.nextLine();
		     				System.out.println("Enter Price: ");
		     				double mPrice=Double.parseDouble(sc.nextLine());
		     				System.out.println("Enter RAM Size: ");
		     				int mRam=Integer.parseInt(sc.nextLine());
		     				System.out.println("Enter Color: ");
		     				String mColor=sc.nextLine();
		     				System.out.println("Enter HD Size: ");
		     				int mHd=Integer.parseInt(sc.nextLine());
		     				
		     				return new Mobile(mBrand, mPrice, mRam, mColor, mHd);
		                 case 3:
		                	      
		                	System.out.println("Enter Brand: ");
		     				String lBrand=sc.nextLine();
		     				System.out.println("Enter Price: ");
		     				double lPrice=Double.parseDouble(sc.nextLine());
		     				System.out.println("Enter RAM Size: ");
		     				int lRam=Integer.parseInt(sc.nextLine());
		     				System.out.println("Enter Color: ");
		     				String lColor=sc.nextLine();
		     				System.out.println("Enter HD Size: ");
		     				int lHd=Integer.parseInt(sc.nextLine());
		     				return new Laptop(lBrand, lPrice, lRam, lColor, lHd);
		     				
		                 default :
		                	     System.out.println("It is Invalid choice ! please select valid options");

		                	     return getProduct();

		                 }
		                 	               	
	}

} 
