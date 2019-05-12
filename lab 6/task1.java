//Task:1

class Author
{		
private String name;
private String email;
private char gender;

	public Author(String n,String e, char g)
	{
			name=n;
			email=e;
			gender=g;
	}
	public String getName()
	{
	return name;
	}
		public String getEmail()
	{
	return email;
	}
	public void setName(String email)
	{
	this.email=email;
	}
		public char getGender()
	{
	return gender;
	}
	public String toString()
	{
	return  "Author[name="+name+ ",email="+email+ ",gender="+gender+ "]";
	}
}
class Aut
{
			public static void main(String args[])
			{
			Author a1=new Author("fatima","fyousif30@gmail.com",'f');
			String name=a1.getName();
			String email=a1.getEmail();
			a1.setName("fyousif30@gmail");
			char gender=a1.getGender();
			String show=a1.toString();
			System.out.println(show);
			}
}