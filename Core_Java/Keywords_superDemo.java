package fundamentals;
class Animal
{
	String colour;
	public Animal() {
		colour="black";
	}
	String getcolour()
	{
		return colour;
	}
	void walk()
	{
		System.out.println("\n it can walk");
	}
}
class Tiger extends Animal
{
	String colour;
	public Tiger() {
		colour="White";
	}
	void run_walk()
	{
		super.walk();
		System.out.println("\n Tiger can run");
	}
	String getcolour()
	{
		
		return super.colour+colour;
	}
}
public class Keywords_superDemo {

	public static void main(String[] args) {
	Tiger t=new Tiger();
	System.out.println("\n Color of tiger is:"+t.getcolour());
	t.run_walk();


	}

}
