package osama;

import java.util.Scanner;

public class Pocedural {

		public static void main(String[] args) {
			
			int [] arr = new int[] {2,4,16,18,38,68,14,66,128,364,344,388,79,98,9,66};
			
			System.out.println("The sum of the elements of the array");
			System.out.println(function(arr));
			System.out.println("Choose the number less than " + function(arr));
			
				Scanner inp1 = new Scanner(System.in);
				
				System.out.println("Please inter the number");
				
				
				int number = inp1.nextInt();
				if(number > 0)
				{
					function(number,arr);
				}
				else
				{
					System.out.println("It doesnt have a negative number");
					Scanner inp2 = new Scanner(System.in);
					System.out.println();
					System.out.println("Please enter another number");
					number = inp2.nextInt();
					function(number,arr);
				}
				}
			
		
		
		public static void printer()
		{
			System.out.println("It was found successfully");	
		}

		public static int function(int arr[])
		{
			int sum = 1;
			int i = 0;
			while( i < arr.length) 
			{
				
				sum += arr[i];
				 i++;
			}
			return sum;
			
		}
		
		
		public static void function(int number,int arr[])
		{
			boolean check = false;
			
			for(int i = 0; i < arr.length; i++)
			{
				if(arr[i]==number)
				{
					printer();
					check = true;
					break;
				}
			}
			
			if(check == false)
			{
			System.out.println("not found");
			}
		}
		}

	


