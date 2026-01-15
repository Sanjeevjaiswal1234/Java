package shapeBasedproject;

import java.util.Scanner;

public class Driver {
       public static void main(String[] args) {
    	   Scanner sc = new Scanner(System.in);
    	   
		 Game g = new Game();
		 char c ;
		 do {
			 g.selectShape();
			 System.out.println(" press Y/y to continue..");
			 c = sc.next().charAt(0);
			
		 }while(c=='Y' || c=='y');
		 System.out.println( "Thanku game will be ends");

		
	}
}
