//task:3 ==>Write a program that reads N integers and calculates the sum of all those integers provided.


import java.util.Scanner;
class Sum
{  
   public static void main(String args[])
   {
   int sum=0;
   Scanner sc=new Scanner(System.in);
   System.out.print("enter no of elements = ");
   int no=sc.nextInt();
   int a[]=new int[no];
   System.out.print("enter elements= ");
        for(int i=0;i<no;i++)
       {
             a[i]=sc.nextInt();
       }
        for(int i=0;i<no;i++)
      {
             sum=sum+a[i];
      }
           System.out.println("the sum is= "+ sum);
  }
}