package inheritance;

class Member {
	
   String name;
   int age;
   int phoneNo;
   String address;
   double salary;

   public void printDetails() {
       System.out.println("Name: " +name);
       System.out.println("Age: " +age);
       System.out.println("Phone Number: " +phoneNo);
       System.out.println("Address: " +address);
       System.out.println("Salary: " +salary);
   }
}

class Employee extends Member {
   String department;
}

class Manager extends Member {
	String specialization;
}
        
public class newquestion {

	public static void main(String[] args) {
		
		Employee employee=new Employee();
	       employee.name="John David";
	       employee.age=30;
	       employee.phoneNo=1234567890;
	       employee.address="Kalamassery";
	       employee.salary=50000;
	       System.out.println(employee.department ="Software Development");
	       employee.printDetails();
	       
	       System.out.println();
	       

	       Manager manager=new Manager();
	       manager.name="Jane Smith";
	       manager.age=40;
	       manager.phoneNo=987654321;
	       manager.address="Ernakulam";
	       manager.salary=80000;
	       System.out.println(manager.specialization="IT");
	       manager.printDetails();


	}

}


//create a class names member having folloeing members
//1) name
//2) age
//3) phone number
//4) address
//5) salary
//
//it also has a method PrintDetails() which print all the details of the members. 
//two classess employee and manager inherits the member class
//the employee and manager classes have dataMembers ,specialization and department respectively
//assign values to an employee an manager by making an object of both of these class and print the same.
