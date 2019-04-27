//task6: ==> Write java code that takes a value at runtime and searches it in the array. If the value appears in the array then it prints the position of the value or else prints a message that value is not found.

class Search
{  
   public static void main(String args[])
   {
   int array[]={1,2,3,4,5};
    int num=Integer.parseInt(args[0]);
	for(int i=0;i<array.length;i++)
             {
                	   if(num==array[i])
	   {
	           System.out.println("the number is there at the position "+(i+1));
	           break ;
	   }	   
	                   if(num==array.length)
	   {
	           System.out.println("the value is not found. ");
	   }
              }
   }  
}