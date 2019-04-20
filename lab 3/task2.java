//task2: Billing system.

import java.util.Scanner;
class Billing{
   public static void main(String args[])  {
   Scanner sc=new Scanner(System.in);
   System.out.print("enter units= ");
   int unit=sc.nextInt();
   int total;
   if(unit<=50)      {
	  total=10*unit;
	  System.out.println(total+" RS");
	  }
    else if( unit>50 && unit<=100 )       {
	  total=15*unit;
	  System.out.println(total+" RS");
	  }
	else if( unit>100 && unit<=200 )   {
	  total=20*unit;
	  System.out.println(total+" RS");
	  }
	else if( unit>200 && unit<=300 )   {
	  total=25*unit;
	  System.out.println(total+" RS");
	  }
	  else if( unit>300 )    {
	  total=30*unit;
	  System.out.println(total+" RS");
	  }   
   }
}