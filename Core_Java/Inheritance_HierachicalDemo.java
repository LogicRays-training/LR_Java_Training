package fundamentals;
class Shape
{
	void Area()
	{
		System.out.println("\n This is block of Area() method from super-Shape");
	}
}

class Circle extends Shape
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
class Triangle extends Shape
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
public class Inheritance_HierachicalDemo {

	public static void main(String[] args) {
	Circle c=new Circle();
	c.Area();
	
	Triangle t=new Triangle();
	t.Area();

	}

}
