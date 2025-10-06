public class CompareValues
{
    public static void main(String[] args) {
        String a="kumari";
        String b="kumari";                              //true     == compare address
        System.err.println(a==b);
    }
}

/*public class CompareValues
{
    public static void main(String[] args) {
        String a=new String("kumari");                       //false
        String b=new String("kumari");
        System.err.println(a==b);
    }
}*/


/*public class CompareValues
{
    public static void main(String[] args) {
        String a="kumari";
        String b="kumari";                                //true             .equal compare value
        System.err.println(a.equals(b));
    }
}*/


/*public class CompareValues
{
    public static void main(String[] args) {
        String a=new String("kumari");                         //true
        String b=new String("kumari");
        System.err.println(a.equals(b));
    }
}*/


/*public class CompareValues
{
    public static void main(String[] args) {          //false
        String a="kumari";                   
        String b=new String("kumari");
        System.err.println(a==b);
    }
}*/


