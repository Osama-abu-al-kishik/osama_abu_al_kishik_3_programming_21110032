package oop;

import java.util.Scanner;

public class Employees extends Student {
	
	//constructors
	
	Employees()
	{
		
	}
	
	Employees(int id,String name,int age)
	{
		this.setId(id);
		this.setName(name);
		this.setAge(age);
	}
	
	
	//--------------------------------------------------------------
	
	//attributes
	
	private int salary;
	private int yearsOfService;
	
	//--------------------------------------------------------------
	

	//methods
	
	
	//getters setters salary
	
	public int getSalary()
	{
		return salary;
	}

	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	
	
	
	//getters setters yearsOfService
	
	
	public int getYearsOfService()
	{
		return yearsOfService;
	}
	
	public void setYearsOfService(int yearsOfService)
	{
		this.yearsOfService = yearsOfService;
	}
	
	
	
	
	
	
	public void salaryAmount(int yearsOfService)
	{
		
		if(yearsOfService > 0 && yearsOfService < 35)
		{
				if(yearsOfService <= 10)
				{
				salary = 500;
				System.out.println("His monthly salary is " + salary);
				}
				else if(yearsOfService > 10 && yearsOfService <= 18)
				{
				salary = 800;
				System.out.println("His monthly salary is " + salary);
				}
				else if(yearsOfService > 18 && yearsOfService <= 25)
				{
				salary = 1000;
				System.out.println("His monthly salary is " + salary);
				}
		
				else
				{
				salary = 1500;
				System.out.println("His monthly salary is " + salary);
				}
		
		}
		
		else
		{
		System.out.println("The number of years is wrong");
		
		Scanner inp5 = new Scanner(System.in);
		System.out.println("reinter years of service");
		setYearsOfService(inp5.nextInt());
		salaryAmount(getYearsOfService());
		}
	}
	
	

}
