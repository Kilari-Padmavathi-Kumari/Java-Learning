class A
{
      float method(int a,int b)
      {
        System.err.println("adding two numbers a : "+ a);
        System.err.println("adding two numbers b : "+ b);
        return a+b;
      }
      float method(int a,int b,int c)
     {
       System.err.println("i am overloading method current class : "+method(10,20));
       System.err.println("adding three numbers a : "+ a);
       System.err.println("adding three numbers b : "+ b);
       System.err.println("adding three numbers c : "+ c);
       return a+b+c;
     }
}
class Override extends A
{    
    float method(int a,int b,int c)
     {
      System.err.println("i am override class A : "+ super.method(10,20,30));
       System.err.println("adding three numbers a : "+a);
       System.err.println("adding three numbers b : "+b);
       System.err.println("adding three numbers c : "+c);
       return a+b+c;
     }
      short methodTwo(int b)
      {
        System.err.println("methodTWo from Override class");
        System.err.println("i am methodTwo variable b : "+b);
        return (short)b;
      }
   public static void main(String[] args) 
   {
       Override obj=new Override();
        System.err.println("i am override class from current class :"+obj.method(30,40,50));
       System.err.println(obj.methodTwo(34));
   }
}


/*class Override{
  static int m1(int a,int b)
  {
    System.err.println(a);
    System.err.println(b);
    return a+b;
  }
  public static void main(String[] args) {
      System.err.println(m1(2,3));
  }
}*/
