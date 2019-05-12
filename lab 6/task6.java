//Task:6 Show the use of static keyword.
//This code counts the number of objects made using Static keyword.

class UseStatic
{
		static int count;
		static
		{
		count=0;
		}
		public UseStatic()
		{
		count++;
		System.out.println(count+ " objects made"); 
		}
}
class UseOfStatic
{
	public static void main(String args[])
		{
		UseStatic s1=new UseStatic();
		UseStatic s2=new UseStatic();
		UseStatic s3=new UseStatic();
		UseStatic s4=new UseStatic();
		}
}