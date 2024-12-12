package constructor;
public class employee 
{
	    int empid;
	    String empname;
	     
	    public employee(int empid, String empname) 
	    {
	        this.empid=empid;
	        this.empname=empname;
	    }
	    
	    public void display()
	    {
	     System.out.println("Employee id=" + empid);
	     System.out.println("Employee name=" + empname);
	    }
	    
	    public static void main(String[] args) 
		{
	     employee emp= new employee(10,"ahsana");
	     emp.display();
//	     System.out.println(emp.empid);
//	     System.out.println(emp.empname);
	}

}
