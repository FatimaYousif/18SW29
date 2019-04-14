
class LogBool
{
  public static void main(String args[])
  {
    boolean a=true;
    boolean b=false;  
    boolean c=a&b;    //false
    boolean d=a|b;   //true
    boolean e=a^b;   //true
    boolean f=!a;    //false
    int num1=2;
    int num2=3;
    System.out.println("a&b= "+c);
    System.out.println("a|b= "+d);
    System.out.println("a^b= "+e);
    System.out.println("!a= "+f);
    System.out.println(num1==1 && ++num1==num2);  //use of short ckt AND
    System.out.println(num1);
    System.out.println(num1==1 || ++num1==num2);  //use of short ckt OR
    System.out.println(num1);
}
}