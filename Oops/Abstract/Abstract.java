import java.util.Scanner;
abstract class A
 {
    abstract void program(int a);
    void program2(float b)
     {
        System.out.println("i am program2 variable b :"+b);
     }
}
class B extends A {
    void program(int a) {
        System.out.println("i am program variable a :"+a);
        System.err.println("hello");
    }
}
public class Abstract {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        B obj = new B();
        System.err.println("start");
        System.err.println("next given int value");
        obj.program(sc.nextInt());
        System.err.println("process");
        System.err.println("next given float value2");
        obj.program2(sc.nextFloat());
    }
}