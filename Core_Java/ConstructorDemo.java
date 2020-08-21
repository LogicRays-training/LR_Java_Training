package fundamentals;
class EmployeeDetails
{
	int empid;
	String name,designation;
	double sal;
	public EmployeeDetails()
	{
		System.out.println("\n I am in Default Const body");
	}
	public EmployeeDetails(int id, String nm, String de, double s) {
	System.out.println("\n I am in Parametrized Const body");
	empid=id;
	name=nm;
	designation=de;
	sal=s;
	}
	public EmployeeDetails(String nm) {
		System.out.println("\n I am in Parametrized Const body");
		name=nm;
	}
	public EmployeeDetails(EmployeeDetails e3) {
		System.out.println("\n I am in copy Const body");
		empid=e3.empid;
		name=e3.name;
		designation=e3.designation;
		sal=e3.sal;
	}
	void displayEmpDetails()
	{
		System.out.println("\n Emp Id:"+empid);
		System.out.println("\n Emp Name:"+name);
		System.out.println("\n Emp Designation:"+designation);
		System.out.println("\n Emp Salary:"+sal);
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
	EmployeeDetails e1=new EmployeeDetails();
	e1.displayEmpDetails();
	
	EmployeeDetails e2=new EmployeeDetails(11,"Nivedita","Trainer",50000.500);
	e2.displayEmpDetails();
	
	EmployeeDetails e3=new EmployeeDetails("Preet");
	e3.displayEmpDetails();
	
	EmployeeDetails e4=new EmployeeDetails(e3);
	e4.displayEmpDetails();
	
	
	

	}

}
