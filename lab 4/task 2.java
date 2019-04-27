//task2: ==>Write a java program that takes the table,the starting point and the ending point of the table.

import java.util.Scanner;
class Table
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  System.out.print("enter the table= ");
  int tab=sc.nextInt();
  System.out.print("enter the starting point of the table= ");
  int sp=sc.nextInt();  //sp=starting point.
  System.out.print("enter the ending point of the table= ");
  int ep=sc.nextInt();  //ep=ending point.
  int result;
  
            for(int i=sp;i<=ep;i++) 
     {
            result=tab*i;
            System.out.println(tab+ "*" +i+ "="+result);
     } 
 }
}