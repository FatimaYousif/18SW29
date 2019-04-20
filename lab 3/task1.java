//task:1 Making a Marksheet.
import java.util.Scanner;
class Marksheet
{
   public static void main(String args[])
   {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter cpp score= ");
   int cpp=sc.nextInt();
   System.out.println("enter data structures score= ");
   int ds=sc.nextInt();
   System.out.println("enter operating system score= ");
   int os=sc.nextInt();
   int tot_marks=cpp+ds+os;
   double percent=tot_marks*100.0/300.0;
   if(percent>=90)
      {
	  System.out.println("GRADE A");
      }
   else if(percent>=80 && percent<90)
      {
	  System.out.println("GRADE B");
      }
   else if(percent>=70 && percent<80)
      {
	  System.out.println("GRADE C");
      }
	else if(percent>=60 && percent<70)
      {
	  System.out.println("GRADE D");
	  }
	  
	  else if(percent<60)
	  {
	  System.out.println("FAIL");
	  }     
   }
}