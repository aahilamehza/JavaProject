package Newjava;

public class Employee 
{
    int empid;
    String empname;
    String empdesgn;
    
	public static void main(String[] args) 
	{
		//OBJECT CREATION
		Employee emp1 = new Employee();
		System.out.println(emp1.empid=101);
		System.out.println(emp1.empname="Ashina");
		System.out.println(emp1.empdesgn="Test Engineer");
		
		System.out.println();
		
		Employee emp2 = new Employee();
		System.out.println(emp2.empid=102);
		System.out.println(emp2.empname="Afniya");
		System.out.println(emp2.empdesgn="QA Engineer");
		
		
		
	}

}
