//Assignment 3
import java.util.Scanner;

public class ArraySort {
	
	int[] output;
	public static void main(String[] args) {
		ArraySort arraysort= new ArraySort();
		
		int[] input = arraysort.getIntArrayfromUser("Array");
		int[] sortedArray = arraysort.reArrangeByQuickSort(input);
		System.out.println("Sorted Array = ");
		for (int i : sortedArray) {
			System.out.println(i);
		}
		return;
	}
	
	
	/**
	 * Method to rearrange array in ascending order of data by quick sort 
	 * @param in int[] input integer array
	 * @return int[] sorted array
	 */
	public int[] reArrangeByQuickSort(int[] in) {
		output = in;
		quickSort(0, in.length-1);
		return output;
	}
	
	
	/**
	 * Private Method to rearrange array in ascending order of data by quick sort
	 * @param start int start index of array
	 * @param end int last index of array
	 */
	private void quickSort(int start, int end) {
		int pivot, i ,j;
		if(start<end){
			//Select first element as Pivot
			pivot=start;
			i=start;
			j=end;
			
			//Base condition
			while(i<j){
				//increment i till found greater element than pivot
				for(i=start;i<=end;i++)
				{
					if(output[i]>output[pivot])
					{	
						break;
					}
				}
				//decrement j till found lesser element than pivot
				for(j=end;j>=start;j--)
				{
					if(output[j]<=output[pivot])
					{
						break;
					}
				}
				//if i<j than swap
				if(i<j)
				{
					int tmp = output[i];
					output[i]= output[j];
					output[j]= tmp;
				}
			}
			//set pivot to jth element & move pivot to proper position
			int tmp = output[j];
			output[j]=output[pivot];
			output[pivot]=tmp;
			
			//Repeat for sub arrays 
			quickSort(start, j-1);
			quickSort(j+1, end);
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
}
