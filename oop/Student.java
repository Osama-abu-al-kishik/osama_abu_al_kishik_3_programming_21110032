package oop;

public class Student {
	
	
	//constructors
	
		Student()
		{
		//initialize attribute
		
		}
		
		Student(int id,String name)
		{
			//initialize attribute
			this.id = id;
			this.name = name;
		}
		Student(String name,int age)
		{
			//initialize attribute
			this.name = name;
			this.age = age;
		}
		
		Student(int id ,String name,int age)
		{
			//initialize attribute
			this.age = age;
			this.id = id;
			this.name = name;
		}
		
		
		//--------------------------------------------------------------
		
		//attributes
		
		private int id;
		private String name;
		private int age;
		private boolean scholar = true;
		private int average;
		
		//--------------------------------------------------------------
		
		//methods
		
		//getters setters id
		
		void setId(int id)
		{
			this.id = id;
		}
		
		public int getId()
		{
			return this.id;
		}
		
		
		
		//getters setters scholar
		
		
		void setScholar(boolean scholar)
		{
			this.scholar =scholar;
		}

		public boolean getScholar()
		{
			return this.scholar;
		}
		
		
		
		//getters setters name
		
		
		public String getName()
		{
			return name;
		}

		public void setName(String name)
		{
			this.name = name;
		}
		
		
		
		//getters setters age

		
		public int getAge() 
		{
			return age;
		}

		public void setAge(int age)
		{
			this.age = age;
		}
		
		
		
		//getters setters average

		
		public int getAverage() 
		{
			return average;
		}

		public void setAverage(int average) 
		{
			this.average = average;
		}
		
		
		
		
		
		public void getscholar(int getAverage)
		{
			if(average >= 85)
			{
				scholar = true;
				System.out.println("Congratulation, " +name+ " is get a scholarship");
			}
			else
			{
				System.out.println("Good luck, "+name+ " can not get scholarship");
			}
		}

}
