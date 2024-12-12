package packg;

public class TestQuestions 
{

	public static void main(String[] args)
	{
		 // Number 1 question answer.
		 int num1 = 23;
	     int num2 = 45;

	     String equals = (num1 == num2) ? "23 and 45 are equal." : "23 and 45 are not equal.";
	     System.out.println(equals);
	     
	     
	     // Number 2 question answer.
	     int a=55;
	     int b=70;
	     System.out.println((a < 50) && (a < b));
	     
	     
	     // Number 3 question answer.
	     int c=20;
	     int d=30;
	     System.out.println("Value of a before swapping: "+c+"\n"+ "Value of b before swapping: "+d);
	     c = c + d; 
	     d = c - d;
	     c = c - d;
	     System.out.println("Value of a after swapping: "+c+"\n"+ "Value of b after swapping: "+d);
	     
	     
	     // Number 4 question answer.
	     int e=17;
	     int SecDig=e%10;
	     System.out.println("The second digit of "+e+" is: "+SecDig);
	
	}

}
