//Task:3 Create a class to print an integer and a character with two methods having the same name but different sequence of the integer and the character parameters.
class Make
{
		int x;
		char ch;
				public void Stars(int c, char m)
				{
				 	 x=c;
					ch=m;
					for(int i=1;i<=x;i++)
						{
						System.out.print(ch);
						}
				}
				public void Stars(char m, int c)
				{
				    ch=m;
				    x=c;
					for(int i=1;i<=x;i++)
						{
						System.out.print(ch);
						}
				}

}
class Making
{
		public static void main(String args[])
		{
				Make m1=new Make();
				m1.Stars(5,'*');
				System.out.println();
				m1.Stars('#',6);
		}
}