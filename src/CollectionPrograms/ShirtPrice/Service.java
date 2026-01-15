package CollectionPrograms.ShirtPrice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
//import java.util.Collections;

public class Service {
	
	  private List<Shirt> shirts = new ArrayList<>();
	  private Scanner sc = new Scanner(System.in);
	  
	  
	  public void start() {
		  
		  String choice;
		  
		  do {
			  options();
			  System.out.println("press yes to continue ");
//			  sc.nextLine();
			  choice = sc.nextLine();

		  }while(choice.equalsIgnoreCase("yes"));
		        System.out.println("Thanku you ! Application  Ends ");

		     		 	  
	  }
		 	  
	  public void options() {
		  System.out.println("press 1 to add a shirt");
		  System.out.println("press 2 to access all shirt");
		  System.out.println("press 3 to access shirt by brand");
		  System.out.println("press 4 to access shirt by price");
		  System.out.println("press 5 to access shirt by price and size");
		  System.out.println("press 6 for short all shirt on size Basis");
		  System.out.println("Press 7 for short all shirt in price Basis");
		  System.out.println("press 8 for List All the Brand");
		  System.out.println("Press 9 for List All the size Availabel");
		  
          System.out.println("Press  10 for List All the Color");
          System.out.println("Press  11 for count the number of shirt According to Brand");
          System.out.println("Press  12 for count the number of shirt According to Color");
          System.out.println("Press  13 for count the number of shirt According to Size");
          System.out.println("press 14 for count all the Brand of Shirt");
          System.out.println("press 15 for count all the Size of Shirt");
          System.out.println("press 16 for count all the color of Shirt");
          
          

		  System.out.println("prsess 20 to  exit");
		  
		  int choice=	Integer.parseInt(sc.nextLine());
		  
		  
		  switch(choice) {
		       
		  case 1:
			     System.out.println("Entre the shirt Brand :");
			    
			     String brand = sc.nextLine();
			     System.out.println("Enter the shirt color :");
			     String color = sc.nextLine();
			     System.out.println("Enter the shirt price :");
			     double price = Double.parseDouble(sc.nextLine());
			     System.out.println("Enter the size :");
			     int size = Integer.parseInt(sc.nextLine());
			     
			     Shirt newShirt = new Shirt(brand , color,price,size);
			     
			     shirts.add(newShirt);
			     System.out.println("Shirt added Successfully");
			     break;
			     
		  case 2:
			       displayAllShirt();
			       break;
		  	  
		  case 3:
			   
			    System.out.println("Enter the brand:");
			    String ubrand = sc.nextLine().trim();
			    accessShirtsByBrand(ubrand);
			    break;
			    
		  case 4:
			   System.out.println("Enter the price");
			   double uprice = Double.parseDouble(sc.nextLine());
			  accessShirtsByPrice(uprice);
			   break;
		  case 5:
			  System.out.println("Enter the price");
			  double sprice = Double.parseDouble(sc.nextLine());
			  System.out.println("Enter the size");
			  int uSize = Integer.parseInt(sc.nextLine());
			  
			  accessShirtsByPriceAndSize(sprice,uSize);
			   break;
		  case 6:
			  
			       sortAllShirtOnSize();
			         break;
		  case 7:
			       sortAllShirtOnPrice();
			        break;
		  case 8:
			  Set<String> brands=getAllBrands();
				System.out.println("All Brands are: "+brands);
				break;
		  case 9: Set<Integer> sizes = getAllSize();
		            System.out.println(" All Size are:"+sizes);
		            break;
		  case 10:
			    Set<String> colors = getAllColor();
	            System.out.println(" All Size are:"+colors);
	            break;
		  case 11:
			      System.out.println("Enter the Brand");
			      String aBrand = sc.nextLine();
			       int totalShirt= getAllShirtAsPerUserBrand( aBrand);
			      
			     System.out.println("Total shirt of "+aBrand+" Brand  is :"+totalShirt);
			     break;
		  case 12:
		      System.out.println("Enter the Color");
		      String uColor = sc.nextLine();
		       int totalColor = getAllShirtAsPerUserColor( uColor);
		      
		     System.out.println("Total shirt of "+uColor+" Color is :"+totalColor);
		     break;
		  case 13:
		      System.out.println("Enter the Size");
		      int cSize = Integer.parseInt(sc.nextLine());
		       int totalSize = getAllShirtAsPerUserSize( cSize);
		      
		     System.out.println("Total shirt of "+cSize+" Size is :"+totalSize);
		     break;
		  case 14:
			     Map<String, Integer> counts = getCountOfAllBrands();
			           System.out.println(counts);
			         counts.forEach((k,v)->System.out.println(k+" brand has :"+v+" shirts"));
                   break;
		  case 15:
			     Map<Integer, Integer> countss = getCountOfAllSize();
			           System.out.println(countss);
			         countss.forEach((k,v)->System.out.println(k+" Size has :"+v+" shirts"));
                break;
		  case 16:
			     Map<String, Integer> countsC = getCountOfAllColors();
			           System.out.println(countsC);
			         countsC.forEach((k,v)->System.out.println(k+" Color has :"+v+" shirts"));
                break;
		  case 20: 
			     System.out.println("Existing...");
                 System.exit(0);
                 
          default :
        	      System.out.println(" Invalid choice ,please try Again ");

			     
		  } 
		 // sc.nextLine(); // clear buffer after switch		 
	  }
	  
	
	  public void addShirt(Shirt s) {
		  
		  shirts.add(s);
		  
	  }
	  public void displayAllShirt() {
		    
		  for(Shirt s : shirts ) {
			  
			  System.out.println(s);

		  }
	  }
	  public void accessShirtsByBrand(String brand) {
		  boolean found = false;
		  
		  for(Shirt s :shirts) {
			  
			  if(s.brand.equalsIgnoreCase(brand)) {
				  System.out.println(s);
				  found = true;
			  }
		  }
			  if(!found) {
				  System.out.println("No shirt Found there is brand "+ brand );	
		  }
		
	  }
	  private void accessShirtsByPrice(double uprice) {
			boolean  found = false;
		  for(Shirt s:shirts) {
			  
			 if(s.price<=uprice) {
				 System.out.println(s);
				 found = true;
			 }
		  }
		  if(!found) {
			  System.out.println("No shirt Found there is price  "+ uprice);	
	  }
		}

	  public void accessShirtsByPriceAndSize(double sprice, int uSize) {
		
		   boolean found = false;
		   for(Shirt s:shirts) {
			   if( s.size==uSize && s.price<sprice) {
				   System.out.println(s);

				   
				   found= true;
			   }
		   }
		   if(!found) {
				  System.out.println("No shirt Found there is price : "+ sprice +" and size :"+uSize);	
		  }
	}
	  
	  public  void sortAllShirtOnSize() {
		  
		  System.out.println("All shirt are sorted  On size");
		  
//		  Collections.sort(shirts,(a,b)->a.size-b.size);//assending Order low to high
		  Collections.sort(shirts,(a,b)->b.size-a.size);// Dessceding Order High to low
		  
		  for(Shirt s:shirts) {
			  System.out.println(s);

		  }
		  

			
		}

		  public void sortAllShirtOnPrice() {
			  
			  System.out.println("All shirt are sorted  On Price");
			  
	//		  Collections.sort(shirts,(a,b)->(int)(a.price-b.price));// Low to high
			  
			  //Collections.sort(shirts,(a,b)->(int)(b.price-a.price));// high to low
	
Collections.sort(shirts, Comparator.comparingDouble((Shirt s)->s.price).thenComparingInt(s->s.size).thenComparing(s->s.brand));
			  for(Shirt s:shirts) {
				  System.out.println(s);

			  }
			  System.out.println("Sorting is successfully completred!");
			
		}
		  public Set<String> getAllBrands() {
				Set<String> brands=new HashSet<>();
				for(Shirt s:shirts)
					brands.add(s.brand);
			return brands;
			}
         public Set<Integer>  getAllSize(){
        	       
        	 Set<Integer> sizes = new HashSet<>();
        	 
        	       for(Shirt s:shirts)
        	    	  sizes.add(s.size);
        	    	  
        	  return sizes;
         }
         public Set<String>  getAllColor(){
  	       
        	 Set<String> colors = new HashSet<>();
        	 
        	       for(Shirt s:shirts)
        	    	  colors.add(s.color);
        	    	  
        	  return colors;
         }
         public int getAllShirtAsPerUserBrand( String aBrand) {
        	 
        	 int count =0;
        	 
        	 for(Shirt s :shirts) {
        		 
        		 if(s.brand.equalsIgnoreCase(aBrand))
        			 count++;
        	 }
        	 return count;
         }
          public int getAllShirtAsPerUserColor( String uColor) {
        	 
        	 int count =0;
        	 
        	 for(Shirt s :shirts) {
        		 
        		 if(s.color.equalsIgnoreCase(uColor))
        			 count++;
        	 }
        	 return count;
         }
          public int   getAllShirtAsPerUserSize(int  cSize) {
        	  
        	  int count =0;
         	 
         	 for(Shirt s :shirts) {
         		 
         		 if(s.size==cSize)
         			 count++;
         	 }
         	 return count;
          }
          public Map<String, Integer> getCountOfAllBrands(){
      		Map<String, Integer> counts=new HashMap<>();
      		for(Shirt s: shirts) {
      			int count=counts.getOrDefault(s.brand.toLowerCase(), 0);
      			counts.put(s.brand.toLowerCase(), count+1);
      		}
      	return counts;
      	}
          public Map<Integer, Integer> getCountOfAllSize(){
        		Map<Integer, Integer> countss=new HashMap<>();
        		for(Shirt s: shirts) {
        			int count=countss.getOrDefault(s.size, 0);
        			countss.put(s.size, count+1);
        		}
        	return countss;
        	}
          public Map<String, Integer> getCountOfAllColors(){
        		Map<String, Integer> counts=new HashMap<>();
        		for(Shirt s: shirts) {
        			int count=counts.getOrDefault(s.color.toLowerCase(), 0);
        			counts.put(s.color.toLowerCase(), count+1);
        		}
        	return counts;
        	}
	

}
