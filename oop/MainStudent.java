package oop;

import java.util.Scanner;

public class MainStudent {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student std1 = new Student();
		
		std1.setName("osama");
		std1.setAge(18);
		std1.setId(274);
		System.out.println("name " + std1.getName() + "   ID "+std1.getId() + "   age " + std1.getAge());
		
		
		
		Scanner inp1 = new Scanner(System.in);
		System.out.println("Inter " + std1.getName() + "  average");
		
		std1.setAverage(inp1.nextInt());
		std1.getscholar(std1.getAverage());
		
		
		
		
		
		
		System.out.println("-------------------------------------------------");
		
		Student std2 = new Student(895,"izzat",20);
		System.out.println("name " + std2.getName() + "   ID "+std2.getId() + "  age " + std2.getAge());
		Scanner inp2 = new Scanner(System.in);
		System.out.println("Inter " + std2.getName() + "  average");
		
		std2.setAverage(inp2.nextInt());
		std2.getscholar(std2.getAverage());
		
		System.out.println("-------------------------------------------------");
		
		
		Student std3 = new Student(456,"zaid",18);
		
		System.out.println( "name "+ std3.getName() + "   ID "+std3.getId() + "   age "+std3.getAge() );
		Scanner inp3 = new Scanner(System.in);
		System.out.println("Inter " + std3.getName() + "  average");
		
		std3.setAverage(inp3.nextInt());
		std3.getscholar(std3.getAverage());
		
		
		

		
	}
}
