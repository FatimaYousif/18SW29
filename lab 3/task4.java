//task4: performing arithmetic operations on 2 numbers.
class Operation
{
     public static void main(String args[])
	 {
	 int num1=Integer.parseInt(args[0]);
                 char a=args[1].charAt(0);
	 int num2=Integer.parseInt(args[2]);
	 int operation;
	  if(a=='+')
	 {
	 operation=num1+num2;
	 System.out.println("result= "+operation);
	 }
	 else if(a=='-')
	 {
	 operation=num1-num2;
	 System.out.println("result= "+operation);
	 }
	 else if(a=='*')
	 {
	 operation=num1*num2;
	 System.out.println("result= "+operation);
	 }
	 else if(a=='/')
	 {
	 operation=num1/num2;
	 System.out.println("result= "+operation);
	 }
    }
}