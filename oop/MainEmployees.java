package oop;

import java.util.Scanner;

public class MainEmployees {

	public static void main(String[] args) {
		
		
		
		
		Employees emp1 = new Employees(865,"Mohammad",28);
		System.out.println( "The first employee name is "+ emp1.getName() + "   his ID is "+emp1.getId() + "    his age is "+emp1.getAge());
		
		Scanner inp1 = new Scanner(System.in);
		System.out.println("How long has "+emp1.getName()+ " served?");
		
		emp1.setYearsOfService(inp1.nextInt());
		emp1.salaryAmount(emp1.getYearsOfService());
		
		
		
		System.out.println("-------------------------------------------------");
		
		
		Employees emp2 = new Employees(993,"Ali",35);
		System.out.println( "The second employee name is "+ emp2.getName() + "   his ID is "+emp2.getId() + "    his age is "+emp2.getAge());
		
		Scanner inp2 = new Scanner(System.in);
		System.out.println("How long has "+emp2.getName()+ " served?");
		
		emp2.setYearsOfService(inp2.nextInt());
		emp2.salaryAmount(emp2.getYearsOfService());
		
		System.out.println("-------------------------------------------------");
		
		
		Employees emp3 = new Employees(754,"khaled",43);
		System.out.println( "The third employee name is "+ emp3.getName() + "   his ID is "+emp3.getId() + "    his age is "+emp3.getAge());
		
		Scanner inp3 = new Scanner(System.in);
		System.out.println("How long has "+emp3.getName()+ " served?");	
		
		emp3.setYearsOfService(inp3.nextInt());
		emp3.salaryAmount(emp3.getYearsOfService());
		
		
		System.out.println("-------------------------------------------------");
		
		
		
		Employees emp4 = new Employees(142,"Abdalrahman",52);
		System.out.println( "The fourth employee name is "+ emp4.getName() + "   his ID is "+emp4.getId() + "    his age is "+emp4.getAge());
		
		Scanner inp4 = new Scanner(System.in);
		System.out.println("How long has "+emp4.getName()+ " served?");
		
		emp4.setYearsOfService(inp4.nextInt());
		emp4.salaryAmount(emp4.getYearsOfService());

	}

}
