package Newjava;

import java.util.Scanner;

public class Switchoperation 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("Choose an operation to perform: ");
        System.out.println("1. Addition(+)");
        System.out.println("2. Subtraction(-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division(/)");
        System.out.println("5. Modulus(%)");

        int choice = sc.nextInt();

        switch(choice) 
        {
            case 1:
                System.out.println("Result:"+(a+b));
                break;
            case 2:
                System.out.println("Result:"+(a-b));
                break;
            case 3:
                System.out.println("Result:"+(a*b));
                break;
            case 4:
                if (b!=0) 
                {
                    System.out.println("Result:"+(a/b));
                } 
                else
                {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            case 5:
                if (b!=0) 
                {
                    System.out.println("Result:"+(a%b));
                } 
                else 
                {
                    System.out.println("Modulus by zero is not allowed.");
                }
                break;
                default:
                System.out.println("Invalid choice. Please select a number between 1 and 5.");
        }

    }
}
