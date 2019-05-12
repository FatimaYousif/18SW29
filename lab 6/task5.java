//Task5

class Student
{
		String name;
		int age;
		String address;
		public Student()
		{
		name="null";
		age=0;
		address="not available";
		}
		public void setInfo(String n,int a)
		{
				name=n;
				age=a;
		}
		public void setInfo(String n, int a, String ad)
		{
				name=n;
				age=a;
				address=ad;
		}
		public void display()
		{
		System.out.println("name= "+name);
		System.out.println("age= "+age);
		System.out.println("address= "+address);
		System.out.println();
		System.out.println();
		}
}
class Studd
{
		public static void main(String args[])
		{
			Student s[]=new Student[10];
			Student s1=new Student();
			s1.setInfo("fatima",18,"fyousif30@gmail.com");
			s[0]=s1;
			Student s2=new Student();
			s2.setInfo("ali",17,"london");
			s[1]=s2; 
			Student s3=new Student();
			s3.setInfo("ali rehman",17);
			s[2]=s3; 
			Student s4=new Student();
			s4.setInfo("fariha",16);
			s[3]=s4; 
			Student s5=new Student();
			s5.setInfo("sobia",16);
			s[4]=s5; 
			Student s6=new Student();
			s6.setInfo("wahid",20,"ksa");
			s[5]=s6; 
			Student s7=new Student();
			s7.setInfo("rehman",17);
			s[6]=s7; 
			Student s8=new Student();
			s8.setInfo("rawal",19);
			s[7]=s8; 
		 	Student s9=new Student();
			s9.setInfo("sana",19);
			s[8]=s9; 
		 	Student s10=new Student();
			s10.setInfo("rohima",19);
			s[9]=s10; 
			 for(int i=0;i<10;i++)
				 {
				s[i].display();		
				 }
    	}
}