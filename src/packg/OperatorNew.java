package packg;

public class OperatorNew 
{

	public static void main(String[] args) 
	{
		 //arithmetic operators
		 int a=10,b=40;
		 System.out.println("The value of a+b="+(a+b));
		 System.out.println("The value of a-b="+(a-b));
		 System.out.println("The value of a*b="+(a*b));
		 System.out.println("The value of a/b="+(a/b));  //quotient
		 System.out.println("The value of a%b="+(a%b));  //remainder
		 
		 
		 //assignment operators
		 System.out.println("The value of a=b="+(a=b));
		 System.out.println("The value of a+=b="+(a+=b));
		 System.out.println("The value of a-=b="+(a-=b));
		 System.out.println("The value of a/=b="+(a/=b));
		 System.out.println("The value of a*=b="+(a*=b));
		 System.out.println("The value of a%=b="+(a%=b));
		 

		 //relational operators
		 System.out.println("The value of a==b="+(a==b));
		 System.out.println("The value of a<=b="+(a<=b));
		 System.out.println("The value of a>=b="+(a>=b));
		 
		 
		 
		 //logical operators 
//		 A B A&&B A||B !A !B
//		 0 0  0     1  1   1
//		 1 0  O     1  0   1
//		 0 1  0     1  1   0
//		 1 1  1     1  0   0
		 
		 String username="ab";
		 String password="123pass";	 
		 System.out.println((username=="ab")&&(password=="123pass"));
		 System.out.println((username=="abjf3i")&&(password=="123pawkenss"));
		 System.out.println((username=="ab")&&(password=="123pawkenss"));
		 System.out.println((username=="ab")||(password=="123pass"));
		 System.out.println((username=="wjcerrv")&&(password=="123pass"));
		 System.out.println((username=="akjvnb")||(password=="123pass"));
		 System.out.println(!(username=="ajedjne"));
		 System.out.println(!(username=="ab"));
		 
		 
		 //unary operators
		 
		 int c1=10, c2=34;
		 
		 //c1++ post increment
		 System.out.println(c1++);
		 System.out.println(c1);
		 
		 //++c1 preincrement.
		 System.out.println(++c1);
		 System.out.println(c1);
		 
		 //c2++ post decrement
		 System.out.println(c2++);
		 System.out.println(c2);
		 
		 //++c2 predecrement.
		 System.out.println(++c2);
		 System.out.println(c2);
		 
		 
	//ternary operators(?:)
    //syntax variable=condition?exp1:exp2
		
		 String v = c2 > c1 ? "c2 is larger" : "c1 is larger";
		 System.out.println(v);
		 
		
	     

	}

}
