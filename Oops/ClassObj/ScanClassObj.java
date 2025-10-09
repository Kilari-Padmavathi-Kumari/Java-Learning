
import java.util.Scanner;

class ScanClassObj
{
    static Scanner sc=new Scanner(System.in);
    int value=sc.nextInt();
    static String email=sc.next();
    float scan(int a)
    {
        System.err.println("i am scan a :"+a); 
        return a;
    }

    public ScanClassObj() {
        System.err.println("i am con");
        System.err.println("scan method :"+scan(2));
    }
    public static void main(String[] args) {
        ScanClassObj obj=new ScanClassObj();        //first memory allocated static instance  variable after non static instance varible
        System.err.println("first given int value");       //after con
        System.err.println("istance int value :"+obj.value);
        System.err.println("given String value");
        System.err.println("instance String email :"+email);
    }
    
}