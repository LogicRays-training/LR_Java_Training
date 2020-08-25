package fundamentals;
abstract class Shape_Abs
{
	//construtor
	public Shape_Abs() {
		
	}
	//static method
	static void method_static()
	{
		System.out.println("\n This is static method of parent");
	}
	//abstarctv method
	abstract void Area();
	//final method
	final void method_final()
	{
		System.out.println("\n This is final method of parent which that only can rule on it");
	}
	//non abstract method
	void printMsg()
	{
		System.out.println("\n I am non abstract method");
	}
	
}

class Circle_Abs extends Shape_Abs
{
	double radius;

	@Override
	void Area() {
		System.out.println("\n This is block of Area() method from sub-Circle");
		radius=5.6;
		double area=radius*radius*3.14;
		System.out.println("\n Area of circle:"+area);
		
	}
	
}
class Triangle_Abs extends Shape_Abs
{
	double height,base;

	@Override
	void Area() {
		System.out.println("\n This is block of Area() method from sub-Tiangle");
		height=5.6;
		base=7.4;
		double area=0.5*height*base;
		System.out.println("\n Area of Triangle:"+area);
		
	}
	
}

public class Abstraction_AbstractClassDemo {

	public static void main(String[] args) {
		//Upcasting-reference of Parent class passed to object of child class
	Shape_Abs c=new Circle_Abs();//Upcasting
	c.Area();
	c.printMsg();
	c.method_final();
	Shape_Abs.method_static();
	
	Shape_Abs t=new Triangle_Abs();//Upcasting
	t.Area();
	t.printMsg();
	
	}

}
