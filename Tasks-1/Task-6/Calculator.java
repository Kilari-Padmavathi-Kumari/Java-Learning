public class Calculator
{
    int add(int a,int b)
    {
        System.err.println("a value : "+a);
        System.err.println("b value : "+b);
        return a+b;
    }
    int add(int a,int b,int c)
    {
        System.err.println("a value : "+a);
        System.err.println("b value : "+b);
        System.err.println("c value : "+c);
        return a+b+c;
    }
    public static void main(String[] args) {
        Calculator obj= new Calculator();
        System.err.println("two para add result : "+obj.add(2,3));
        System.err.println("three para add result : "+obj.add(3,4,5));
    }
}