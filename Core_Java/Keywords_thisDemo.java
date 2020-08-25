package fundamentals;

import java.util.Scanner;

class Book
{
	int bookid;
	String book_name,author_name;
	double price,quantity,order;
	public Book() {
		this(11,"C lang","Yashvant Kanetkar",1000.50);//call parametrized
		System.out.println("\n Default const called");
	}
	public Book(int bookid,String book_name,String author_name,double price) {
	//this();//call default const body also
	System.out.println("\n Parametrized const called");
	this.bookid=bookid;
	this.book_name=book_name;
	this.author_name=author_name;
	this.price=price;
	}
	void calPrice()
	{
		System.out.println("\n Enter quantity fro book:");
		Scanner sc=new Scanner(System.in);
		
		quantity=sc.nextDouble();
		
		double final_amt=quantity*price;
		System.out.println("\n Your final ammount is:"+final_amt);
	}
	void displayBookInfo()
	{
		System.out.println("\n Book ID:"+bookid);
		System.out.println("\n Book Name:"+book_name);
		System.out.println("\n Book Author name:"+author_name);
		System.out.println("\n Book Price:"+price);
		this.calPrice();
	}
	
}
public class Keywords_thisDemo {

	public static void main(String[] args) {
	Book b1=new Book();
	b1.displayBookInfo();
	

	}

}
