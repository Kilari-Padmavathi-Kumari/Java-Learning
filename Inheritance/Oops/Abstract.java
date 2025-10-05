import java.util.Scanner;
abstract class A {

    abstract void m1(int a);
    void m2(float b)
     {
        System.out.println(b);
     }
}
class B extends A {
    @Override
    void m1(int a) {
        System.out.println(a);
        System.err.println("hello");
    }
}
public class Abstract {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        B obj = new B();
        System.err.println("start");
        obj.m1(sc.nextInt());  
        System.err.println("process");
        obj.m2(sc.nextFloat()); 
    }
}