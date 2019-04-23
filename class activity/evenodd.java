class EvenOdd
 {
         public static void main(String args[])
  {
  System.out.println("even numbers:");
    for(int i=0;i<=25;i++)
    {
       if(i%2 != 0)
       {
       continue;
       }
    System.out.println(i);
    }
////////////////////////////////
  System.out.println("odd numbers:");
     for(int i=0;i<=25;i++)
     {
        if(i%2 == 0)
       {
       continue;
       }
     System.out.println(i);
     }
  }
}