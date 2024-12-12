package Interface;

import java.util.Scanner;

interface BankApp
{
	public void bankname();
	public void holdername();
	public void accountdetails();
	public void balance();
	public void withdraw();
	public void deposit();
}

class HDFC implements BankApp
{
	String bankName="HDFC Bank";
	String holdername;
	long accountnumber;
	double accountbalance=120000.00;
	
	Scanner sc=new Scanner(System.in);

	@Override
	public void bankname() 
	{
		System.out.println("Bank Name: " + bankName);
	}

	@Override
	public void holdername() 
	{
		System.out.println("Enter the Holder name:");
		holdername=sc.nextLine();
		System.out.println("Holder Name: " + holdername);

	}

	@Override
	public void accountdetails() 
	{
		System.out.println("Enter the account number:");
		accountnumber=sc.nextLong();
		System.out.println("Account Number: " + accountnumber);
		
	}

	@Override
	public void balance()
	{
		System.out.println("Account Balance: " + accountbalance);
		
	}

	@Override
	public void withdraw()
	{
		   System.out.print("Enter the amount to withdraw: ₹");
	        double amount = sc.nextDouble();
	        if (amount<=accountbalance)
	        {
	            accountbalance -= amount;
	            System.out.println("Withdrawal successful. Your new balance is ₹" + accountbalance);
	        } 
	        else
	        {
	            System.out.println("Insufficient balance! Your current balance is ₹" + accountbalance);
	        }
		
	}

	 @Override
	    public void deposit()
	    {
	        System.out.print("Enter the amount to deposit: ₹");
	        double amount = sc.nextDouble();
	        accountbalance += amount;
	        System.out.println("Deposit successful. Your new balance is ₹" + accountbalance);
	    }
	
}

public class BankApplication
{
    public static void main(String[] args)
    {
      
        HDFC ob = new HDFC();
        ob.bankname();
        ob.holdername();
        ob.accountdetails();
        ob.balance();

        ob.deposit();
        ob.withdraw();
        ob.balance();
    }
}

