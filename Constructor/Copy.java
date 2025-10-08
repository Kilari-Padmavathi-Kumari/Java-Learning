class Copy
{
    Copy()
    {
        System.err.println("hello default");
    }
    Copy(int a)
    {
        System.err.println("hello para con");
        System.err.println(a);
    }
    Copy(Copy a)
    {
        System.out.println("hello copy");
    }
    public static void main(String[] args) {
     
       new Copy(3);
  
       Copy obj1=new Copy(new Copy()); 
    }
}