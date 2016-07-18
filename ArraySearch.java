//Assignment 2
import java.util.Scanner;

public class ArraySearch {
	
	static int NOT_FOUND = -1;

	public static void main(String[] args) {
		ArraySearch arraysearch= new ArraySearch();
		
		System.out.println("Press 1 for Linear Search \nPress 2 for Binary Search");
		int choice =0;
		while(true){
		choice=arraysearch.getIntfromUser("Choice");
		if(choice==1 || choice == 2)
			 {
			 	break;
			 }
		else
			{
				System.out.println("Invalid Choice, Try again");
			}
		}
		
		switch(choice)
		{
			//For Linear Search
			case 1:
			{	int[] input = arraysearch.getIntArrayfromUser("Array for Linear search");
				int elementToFind= arraysearch.getIntfromUser(" Find");
				int result = arraysearch.findElementByLinear(input, elementToFind);
				if(result!=NOT_FOUND)
				{
					System.out.println("Element found at "+result );
				}
				else
				{
					System.out.println("Element Not found");
				}
				break;
			}	
			
			//For Binary search
			case 2:
			{
				int[] input2 = arraysearch.getIntArrayfromUser("Array for Binary search");
				int elementToFind2= arraysearch.getIntfromUser(" Find ");
				int result2 = arraysearch.findElementByBinarySearch(input2, elementToFind2);
				if(result2!=NOT_FOUND)
				{
					System.out.println("Element found at "+result2 );
				}
				else
				{
					System.out.println("Element Not found");
				}
			}
			
		}
	}
	
	
	/**
	 * Public method to search an element by linear search
	 * @param array int[] input array
	 * @param element int element to find
	 * @return int index of element
	 */
	public int findElementByLinear(int[] array,int element) {
		return linearSearch(array, array.length, element);
	}
	
	
	/**
	 * Private method to search an element by linear search
	 * @param array int[] input array
	 * @param size int length of array
	 * @param element int element to find
	 * @return int index of element
	 */
	private int linearSearch(int[] array, int size , int element) {
		if(size<=0)
		{
			return NOT_FOUND;
		}
		if(array[size-1]==element)
		{
			return size-1;
		}
		else
		{
			return linearSearch(array, size-1, element);
		}	
	}
	

	/**
	 * Public method to search an element by binary search
	 * @param array int[] input array
	 * @param element int element to find
	 * @return int index of element
	 */
	public int findElementByBinarySearch(int[] array,int element) {
		return binarySearch(array, 0, array.length-1, element);
	}
	
	
	/**
	 * Private method to search an element by binary search
	 * @param array int[] input array
	 * @param start int start index of array
	 * @param end int end index of array
	 * @param element int element to find
	 * @return int index of element
	 */
	private int binarySearch(int[] array, int start, int end, int element) {
		int mid = (start+end)/2;
		if(end<start)
		{
			return NOT_FOUND;
		}
		
		if(array[mid]==element)
		{
			return mid;
		}
		else
		{
			if(array[mid]>element)
			{
				return binarySearch(array, start, mid-1, element);
			}
			else
			{
				return binarySearch(array, mid+1, end, element);
			}
		}
	}
	
	
	/**
	 * Method to read array data from standard input
	 * @param arrayName String Name of array for message
	 * @return int[] array of integer
	 */
	public int[] getIntArrayfromUser(String arrayName) 
	{
		Scanner s= new Scanner(System.in);
		int number = 0;
		
		while(true){
			try {
				System.out.println("Enter number of elements for "+arrayName);
				number=s.nextInt();
				if(number>0)
				{
					break;
				}
				else
				{
					System.out.println("Try Again");
				}
			} catch (Exception e) {
				System.out.println("Invalid Input");
				s.next();
			}
		}
		
		int[] array= new int[number];
		System.out.println("Enter elements for "+arrayName);
		//For reading Array
		for(int i=0;i<number;i++)
		{
			while(true){
				try{
					array[i]=s.nextInt();
					break;
				}
				catch (Exception e)
				{
					System.out.println("Invalid Input, Try again");
					s.next();
				}
			}	
		}
		return array;
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
					System.out.println("Invalid, Try Again");
				}
			} catch (Exception e) {
				System.out.println("Invalid, Try again");
				s.next();
			}
		}
		return number;
	}

}
