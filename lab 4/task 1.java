//task: 1

class Star 
{
  public static void main(String args[]) 
   {
    int x=1;

//part i

                System.out.println("part 1");
                System.out.println();	

                     for(int i=1;i<=5;i++)
                   {
                         for(int j=1;j<=i;j++)
                      {
	  System.out.print("*");
                       }
	  System.out.println();
                   }

//part ii
	System.out.println();
               System.out.println("part 2");
               System.out.println();
                                
                                     for(int i=1;i<=5;i++)
                                  {
                                        for(int j=5;j>=i;j--)
                                {
                                        System.out.print("*");
                                }
	           System.out.println();
                                 }

//part iii

        System.out.println();
          System.out.println("part 3");
          System.out.println();
 
           for(int i=1;i<=5;i++)
        {
                      for(int j=5;j>=i;j--) 
           {
	   System.out.print(" ");
          }
                	for(int k=1;k<=x;k++)
                        {
	             System.out.print("*");
                        }  
	  x=x+2;
	  System.out.println();
       }	   
   }
}