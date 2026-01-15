package shapeBasedproject;
import java.util.Scanner;
public class Game {
	Scanner sc = new Scanner(System.in);
	
	
	{
		System.out.println(" Game has started ! ");

	}
	public void selectShape() {
		System.out.println(" press 1 for=== 2D sahpe ");
		System.out.println(" press 2 for===  3d shape");
		
		int choice = sc.nextInt();
		if(choice==1) {
			System.out.println(" you have selected 2D Shape");
			TwoDshape t1=selectTwoDShape();// non primitive up casting // polymorphism
			t1.area();
			t1.perimeter();
		}
		else if (choice==2) {
			System.out.println(" you have selected 3D shape ");
			ThreeDShape t2=  selectThreeDShape();
			  t2.volume();
			  t2.tsa();
			  t2.lsa();
			
		}
		else {
			System.out.println(" you have entred Invaid choice");
			selectShape();

		}
			
	}
	public TwoDshape selectTwoDShape() {
		System.out.println(" press 1 for== > circle");
		System.out.println(" press 2 for=== > Rectangle");
		int choice = sc.nextInt();
		if(choice==1) {
			System.out.println(" you have a selected circle");
		    System.out.println(" Enter the radius :");
		    double r = sc.nextDouble();
		    
		    return  new Circle(r);
		}
		    else {
		    	System.out.println(" You have selected a Rectangle ");
		        System.out.println(" Enter the length");
		        double l = sc.nextDouble();
		        System.out.println("Enter the width");
		        double w = sc.nextDouble();
		        
              return new Rectangle(l,w);
		    }
		
	     }
	  public ThreeDShape selectThreeDShape() {
		  System.out.println(" press 1 for==== Cylinder ");
		  System.out.println(" press 2 for==== Cube");
		  
             int choice = sc.nextInt();
             if(choice==1) {
            	 System.out.println(" You have selected a cylinder ");
                 System.out.println("Enter the radius");
                 double r= sc.nextDouble();
                 System.out.println("Enter the Height");
                 double h = sc.nextDouble();
                 return new Cylinder(r,h);
             }
             else
             {
            	 System.out.println(" You have selected a cube");
                 System.out.println("Enter the side");
                 double a= sc.nextDouble();
                return new Cube(a);  
             }
            	 



	  }
}
