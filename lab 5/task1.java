//TASK:1 using Scanner class

import java.util.Scanner;
class useScanner
{
		public static void main(String args[])
		{
				Scanner sc=new Scanner(System.in);
				System.out.print("enter your name= ");
				String name=sc.nextLine();    //nextLine function of scanner class used.
				System.out.print("enter your age= ");
				int age=sc.nextInt();    //nextInt function of scanner class used.
				System.out.print("enter Initial of your name= ");
				char alphabet=sc.next().charAt(0);    //nextChar function of scanner class used.
				System.out.print("enter your previous semester's percentage= ");
				float percentage=sc.nextFloat();    //nextFloat or nextDouble function of scanner class used.
				System.out.println();
				System.out.println();
				System.out.println("your name is= "+name);
				System.out.println("your age is= "+age);
				System.out.println("initial of your name is= "+alphabet);
				System.out.println("your previous semester's percentage is= "+percentage);
				
				
		}
}