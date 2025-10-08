class Main{
    Main()
    {
        System.err.println("I am def con");
    }
    Main(int a, int b)
    {
        new Main();                                        // para con calling def con
        System.err.println("I am Para con");            
        System.err.println("para con val :"+a);
        System.err.println("para con val :"+b);
    }
    Main(Main obj)
    {
        new Main(4,5);
        System.err.println("I am copy con");
    }
}
public class AllCon
{
    public static void main(String[] args) {
        new Main(new Main());
    }
}