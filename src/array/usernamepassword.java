package array;

import java.util.Scanner;

public class usernamepassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] arr = new String[3][2]; // 3 users, 2 columns (username and password)

      
        for (int i=0;i< 3;i++) 
        { 
            for (int j=0;j<2;j++) 
            {
                if (j==0) 
                {
                    System.out.println("Enter the Username for user " + (i + 1) + ":");
                    arr[i][j] = sc.nextLine(); 
                } 
                else 
                {
                    System.out.println("Enter the Password for user " + (i + 1) + ":");
                    arr[i][j] = sc.nextLine();
                }
            }
        }

        System.out.println("Usernames and Passwords:");

        for (int i=0;i<3;i++)
        {
            for (int j=0;j<2;j++)
            {
                if (j==0)
                {
                    System.out.print("User " + (i + 1) + " - Username: " + arr[i][j] + ", "); 
                } 
                else
                {
                    System.out.println("Password: " + arr[i][j]);
                }
            }
        }

    }
}
