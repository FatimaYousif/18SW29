
//task6: ==> Write java code that takes a value at runtime and searches it in the array. If the value appears in the array then it prints the position of the value or else prints a message that value is not found.

class Num
{  
   public static void main(String args[])
   {
	   int i;
   int array[]={1,2,3,4,5};
    int num=Integer.parseInt(args[0]);
	for(i=0;i<array.length;i++)
             {
                	   if(array[i]==num)
	   {
	           System.out.println("the number is there at the position "+(i+1));
	           break ;
	   }	   
			 }
			 if(i==array.length)
	           System.out.println("the value is not found. ");
	
              }
   }  
