//TASK:4 Creating a dog class which takes and then prints the name, breed and the age of the dog.

class Dog
{	
	String name;
	String breed;
	int age;
				public void setDetails(String n, String b, int a)
		{
			name=n;
			breed=b;
			age=a;
		}
				public void showDetails()
		{
					System.out.println("name= "+name);
					System.out.println("breed= "+breed);
					System.out.println("age= "+age);					
		}
}
class Doggo
{
		public static void main(String args[])
		{
		Dog d1=new Dog();
		Dog d2=new Dog();
		d1.setDetails("cheddar","bull dog",10);
  	                d1.showDetails();
		System.out.println();
		System.out.println();
		d2.showDetails();
		System.out.println("details unavailable");
		}
}
	
		