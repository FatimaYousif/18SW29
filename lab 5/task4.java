//TASK:4 Creating a student class with a constructor and then displaying it.

class Student
{ 
    String name,rollno;
	int age;
	
	Student(String n,String r,int a)
	{
	name=n;
	rollno=r;
	age=a;
	}
				public void display()
				{
				System.out.println("name= "+name);
				System.out.println("ROLL NO= "+rollno);
				System.out.println("Age= "+age);
				}
}

class Stud
{ 
			public static void main(String args[])
 			{
			Student s1=new Student("Fatima","18sw29",18);
			s1.display();
			}
}
