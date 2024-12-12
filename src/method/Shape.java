package method;
import java.util.Scanner;

public class Shape
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Shape shape = new Shape();
        
        shape.tri();
        shape.cir();
        
        System.out.print("Enter the side length of the square: ");
        int a = sc.nextInt();
        System.out.println("Area of Square: " + shape.square(a));

        
        System.out.print("Enter the length of the rectangle: ");
        int l = sc.nextInt();
        System.out.print("Enter the breadth of the rectangle: ");
        int b = sc.nextInt();
        System.out.println("Area of Rectangle: " + shape.rect(l,b));
    }

    public void tri() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = sc.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
   
    public void cir()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double r = sc.nextDouble();
        double area = 3.14 * r* r;
        System.out.println("Area of Circle: " + area);
    }
    
 
    public int square(int a) 
    {
        return a*a;
    }
   
    public int rect(int l, int b) 
    {
        return l*b;
    }
}

    