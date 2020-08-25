package fundamentals;
class ProductInfo implements Cloneable//Markup or Tagged interface
{
	int prodId;
	String prod_name;
	double price;
	public ProductInfo(int prodId,String prod_name,double price) {
	this.prodId=prodId;
	this.prod_name=prod_name;
	this.price=price;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	@Override
	public String toString() {
		return "\n Prod_id:"+prodId+"\n Prod_name:"+prod_name+"\n price:"+price;
	}
	void displayProductInfo()
	{
		System.out.println("\n Product Id:"+prodId);
		System.out.println("\n Product Name:"+prod_name);
		System.out.println("\n Product price:"+price);
	}
}
public class ObjectClass_Demo {

	public static void main(String[] args) {
	ProductInfo p1=new ProductInfo(111, "Laptop", 50000.50);
	p1.displayProductInfo();
	
	System.out.println("\n After clonning");
	try
	{
		ProductInfo p2=(ProductInfo) p1.clone();
		p2.displayProductInfo();
	} 
	catch (CloneNotSupportedException e) {
		e.printStackTrace();
	}

	
	ProductInfo p3=new ProductInfo(222, "Mobile", 50000.50);
	System.out.println(p3);
	
	//System.out.println(p3.toString());
	}	

}
