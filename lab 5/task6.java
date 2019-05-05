//TASK:6 Create a class that combines Student and Marksheet. The result class must have a constructor that takes student and marksheet objects as parameters and then these objects are used by createStudentResult() function to display student’s bio-data and his marksheet.

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
}
class Marksheet
{ 
	int java;
	int cpp;
	int maths;
	int result;
	double percent;

}
class Result
{
		Student s;
		Marksheet m;
    Result(Student s1, Marksheet m1)
         {
	s=s1;
	m=m1;
         }
    public void createStudentResult()
     {
				System.out.println("name= "+s.name);
				System.out.println("ROLL NO= "+s.rollno);
				System.out.println("Age= "+s.age);
		         		m.result=m.java+m.cpp+m.maths;
	        			System.out.println("result= "+m.result);
         				m.percent=m.result*100/300.0;
		        		System.out.println("percentage= "+m.percent);
         		if(m.percent>90)
				System.out.println("grade=A");
		else if(m.percent>=80 && m.percent<=90)
				System.out.println("grade=B");
		else if(m.percent>=70 && m.percent<80)
				System.out.println("grade=C");
		else if(m.percent>=60 && m.percent<70)
				System.out.println("grade=D");
		else if(m.percent<60)
				System.out.println("FAIL");
								
     }

}

class Mark
{ 
			public static void main(String args[])
 			{
			Student s1=new Student("Fatima","18sw29",18);
			Marksheet m1=new Marksheet();
			m1.java=85;
			m1.cpp=90;
			m1.maths=95;
			Result r1=new Result(s1,m1);
	                                r1.createStudentResult();
			}
}
