//Task:4 Create a class to print the area of a square and a rectangle. The class has two methods with the same name but different number of parameters. The method for printing area of rectangle has two parameters which are length and breadth respectively while the other method for printing area of square has one parameter which is side of square. 

class Area
{
		double length,breadth,result;
		public void square(double l)
				{
				    length=l;
				    result=length*length;
					System.out.println("the area of square is= "+result);
				
				}
				public void rectangle(double l, double b)
				{
				      length=l;
				      breadth=b;
				    result=length*breadth;
					System.out.println("the area of rectangle is= "+result);
				}

}
class AreaSR
{
		public static void main(String args[])
		{
				Area a=new Area();
				a.square(6.0);
				a.rectangle(5.0,6.0);
		}
}