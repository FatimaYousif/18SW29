//task4: ==>Write a java program that calculates the sum of two 2-dimensional arrays(Matrix) and saves the result in the third array and prints the result along with the positions of each element.


class Add
{
   public static void main(String args[])
   {
   int a[][]={{2,3},{4,5}};  
   int b[][]={{1,3},{4,3}};   
   int c[][]=new int[2][2];   //for sum
   for(int i=0;i<2;i++)
   {
         for(int j=0;j<2;j++)
        {
            c[i][j]=a[i][j]+b[i][j];
         }
   }
   
   for(int i=0;i<2;i++)
   {
              for(int j=0;j<2;j++)
              {
                    System.out.println(c[i][j]+" "+"and the position of it is= "+"["+i+"]"+"["+j+"]");
              }
   }   
 } 
}
 