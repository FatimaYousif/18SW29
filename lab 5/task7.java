//TASK:7 

import java.util.Scanner;
class StData
{
		String name1;
		int age1;
		String program1;
	
	public void data(String n1,int a1,String p1)
	{
			name1=n1;
			age1=a1;
			program1=p1;
	}
	public void display()
		{
			System.out.println("name= "+name1);
			System.out.println("age= "+age1);
			System.out.println("program= "+program1);
			System.out.println();
			System.out.println();
		}
}
class Sdata
{
		public static void main(String args[])
		{
		Scanner sc= new Scanner(System.in);
		StData s1=new StData();
		StData s2=new StData();
		s1.data("ali" , 18, "BE-SOFTWARE");
		s2.data("Aisha", 19, "BE-ELECTRONICS");
		System.out.println("STUDENT: 1");
		s1.display();
		System.out.println("STUDENT: 2");
		s2.display();
		}
}



