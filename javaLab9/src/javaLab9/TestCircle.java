package javaLab9;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Circle c1 = new Circle(1.1, "blue");
		System.out.println(c1);
		System.out.println();
		
		Circle c2 = new Circle(2.2);
		System.out.println(c2);
		System.out.println();
		
		Circle c3 = new Circle();
		System.out.println(c3);
		System.out.println();
		//test set radius set color 
		c1.setRadius(3.3);
		c1.setColor("green");
		System.out.print(c1);
		System.out.println("The radius of c1 is: "+c1.getRadius());
		System.out.println("The radius of c1 is: "+c1.getColor());
		
		// tset getAra and getCircumfernce
		System.out.printf("the area is: %.2f%n",c1.getArea() );
		System.out.printf("the area is: %.2f%n",c1.getCircumfernce() );
	    
	}

}
