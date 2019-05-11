//TASK:7 

import java.util.Scanner;

class Sdata
{
		public static void main(String args[])
		{
		Scanner sc= new Scanner(System.in);
		System.out.print("enter name,age,program= ");
		String data=sc.nextLine();
		System.out.print("enter name,age,program of student 2= ");
		String data1=sc.nextLine();
		String parts[]=data.split(",");
		System.out.println("STUDENT: 1");
		System.out.println("name= "+parts[0]);
		System.out.println("age= "+parts[1]);
		System.out.println("program= "+parts[2]);
		System.out.println();
		System.out.println();
		String parts1[]=data1.split(",");
		System.out.println("STUDENT: 2");
		System.out.println("name= "+parts1[0]);
		System.out.println("age= "+parts1[1]);
		System.out.println("program= "+parts1[2]);
		
		}
}



