class UseOfBreak
{ 
  public static void main(String args[])
  {
	  int j;
	  //use of normal break.
  for(int i=0;i<6;i++)
    {
	        for( j=0;j<5;j++)
	         {
	                    if(j==2)
	                     break;
	                     System.out.print(j+" ");
	          }
	     System.out.println();

    }
	//use of break with label.
	outer:
	for(int i=0;i<6;i++)
    {
	        for( j=0;j<5;j++)
	         {
	                    if(j==2)
	                     break outer;
	                     System.out.print(j+" ");
	          }
	     System.out.println();
    }
	System.out.println();
	System.out.println("out of loop.");
	
  }
}
