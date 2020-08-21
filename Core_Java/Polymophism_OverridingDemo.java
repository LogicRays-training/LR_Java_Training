package fundamentals;
class Shape_new
{
	void Area()
	{
		System.out.println("\n This is block of Area() method from super-Shape");
	}
}

class Circle_new extends Shape_new
{
	double radius;
	void Area()
	{
		System.out.println("\n This is block of Area() method from sub-Circle");
		radius=5.6;
		double area=radius*radius*3.14;
		System.out.println("\n Area of circle:"+area);
	}
}
class Triangle_new extends Shape_new
{
	double height,base;
	void Area()
	{
		System.out.println("\n This is block of Area() method from sub-Tiangle");
		height=5.6;
		base=7.4;
		double area=0.5*height*base;
		System.out.println("\n Area of Triangle:"+area);
	}
}

public class Polymophism_OverridingDemo {

	public static void main(String[] args) {
		//Upcasting-reference of Parent class passed to object of child class
	Shape_new c=new Circle_new();//Upcasting
	c.Area();
	
	Shape_new t=new Triangle_new();//Upcasting
	t.Area();

	}

}
