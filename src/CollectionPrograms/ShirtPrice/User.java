package CollectionPrograms.ShirtPrice;

public class User {
	
	  public static void main(String[] args) {
		
		  Service service = new Service();
		  service.addShirt(new Shirt("Arrow","white",2500,40));
		  service.addShirt(new Shirt("Allen","Red",2500,40));
		  service.addShirt(new Shirt("Vanchu","Black",2000,38));
		  service.addShirt(new Shirt("Arrow","blue",2800,40));
		  service.addShirt(new Shirt("Vanchu","Black",30000,36));
		  service.addShirt(new Shirt("Allen","white",3200,40));
		  service.addShirt(new Shirt("Arrow","green",2200,42));
		  service.addShirt(new Shirt("Icon","Brown",3200,32));
		  service.addShirt(new Shirt("Allen ","Red",2800,44));
		  service.addShirt(new Shirt("Vanchu","Balck",4200,40));
		  service.addShirt(new Shirt("Arrow","Orange",1400,34));
		  service.addShirt(new Shirt("Vanchu","white",3400,42));
		  
		  service.start();
		
	      	  
	}

}
