package shapeBasedproject;

public class Rectangle  implements TwoDshape{
          
	double l,w;
	
	    Rectangle( double l , double w ){
	    	this.l = l;
	    	this.w= w;
	    	
	    }
	    public void area() {
	    	double area = l*w;
	    	System.out.println(" Area is : " +area+" sq .unit");

	    }
	    public void perimeter() {
	    	double perimeter= 2*(l+w);
	    	System.out.println(" perimeter is : "+perimeter+" ");

	    }
}
