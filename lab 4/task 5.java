//task:5 ==>Write a java program that find the largest element in the array.

import java.util.Scanner;
class Lar
{  
      public static void main(String args[])
	  {
	  int largest;
	  Scanner sc=new Scanner(System.in);
	  System.out.print("enter the total no: of elements ");
                   int no=sc.nextInt();
  	   int a[]=new int[no];
	  System.out.print("enter the elements ");
	            for(int i=0;i<no;i++)
	    {
	            a[i]=sc.nextInt();
	    }
	  largest=a[0];
	           for(int i=0; i<no;i++)
	  {
		  if(largest<a[i])
			  largest=a[i];
	 
	  }
 System.out.println("largest no is= "+ largest);
	  }
}
	  