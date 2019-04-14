class Bitwise
{
  public static void main(String args[])
  { 
   //& | ~ ^ >> << >>>
  int a=3; 
  int b=a&2;  //2
  int c=a|2;  //3
  int d=~a;   //-4
  int e=a^2;  //1
  int f=a<<2;  //12
  int g=a>>2;  //0
  int h=a>>>1;  //1
  System.out.println("and operation= " +b);
  System.out.println("or operation= " +c);
  System.out.println("not operation= " +d);
  System.out.println("xor operation= " +e);  //exclusive or 
  System.out.println("left shift operation= "+f);
  System.out.println("left shift operation= "+g);
  System.out.println("unsinged right shift operation= "+h);
  }  
}