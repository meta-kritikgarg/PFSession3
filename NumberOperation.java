import java.util.Scanner;

//Assignment 1

public class NumberOperation {
	
	int INVALID_INPUT = -1;
	
	public static void main(String[] args) {
		
		NumberOperation numop= new NumberOperation();
		
		System.out.println("Press 1 for Rimender Calculation \nPress 2 for GCD Calculation \nPress 3 for Largest digit Calculation");
		int choice =0;
		while(true){
			choice=numop.getIntfromUser("Choice");
			if(choice>=1 && choice <= 3)
			{
				break;
			}
			else
			{
				System.out.println("Invalid Choice, Try again");
			}
		}
		
		switch (choice) {
		//For reminder
		case 1:
		{
			System.out.println("Reminder Calculation");
			int num1= numop.getIntfromUser("Num1");
			int num2=numop.getIntfromUser("Num2");
			System.out.println("Reminder is= "+numop.rem(num1, num2));
			break;
		}
			
		//For GCD
		case 2:
		{
			System.out.println("GCD Calculation");
			int num1= numop.getIntfromUser("Num1");
			int num2=numop.getIntfromUser("Num2");
			System.out.println("GCD is= "+numop.gcd(num1, num2));
			break;
		}
		
		//For largest digit
		case 3:
		{		System.out.println("For largest Calculation");
				int num= numop.getIntfromUser("Num");
				System.out.println("Largest digit is= "+numop.largestDigit(num));
				break;
		}
	  }		
	}
	
	/**
	 * Method to compute reminder of x divides y
	 * @param x int
	 * @param y int
	 * @return int reminder
	 */
	public int rem(int x, int y) {
		if(x>=0&&y>0)
		{
			if(x>=y)
			{
				return rem(x-y, y);
			}
		}
		else 
		{
			return INVALID_INPUT;
		}
		return x;
	}
	
	
	/**
	 * Method to find GCD of teo numbers
	 * @param x int Num1
	 * @param y int Num2
	 * @return int GCD of Num1 & Num2
	 */
	public int gcd(int x, int y) {
		if (y!=0)
		{
	        return gcd(y, x%y);
		}
		else 
	    {
			return x;
	    }     
	}
	
	
	/**
	 * Method to find largest digit of number
	 * @param x int input number
	 * @return int max Digit
	 */
	public int largestDigit(int x) {

		 if(x==0)                    
		    {
			 return 0;
		    }
		 return Math.max(x%10, largestDigit(x/10));
	}
	
	
	/**
	 * Method to read integer data from standard input
	 * @param Name of variable to print 
	 * @return int value of integer
	 */
	public int getIntfromUser(String Name) 
	{
		Scanner s= new Scanner(System.in);
		int number = 0;		
		while(true){
			try {
				System.out.println("Enter "+Name);
				number=s.nextInt();
				if(number>0)
				{
					break;
				}
				else
				{
					System.out.println("Invalid Input, Try Again");
				}
			} catch (Exception e) {
				System.out.println("Invalid Input, Try Again");
				s.next();
			}
		}
		return number;
	}
}
