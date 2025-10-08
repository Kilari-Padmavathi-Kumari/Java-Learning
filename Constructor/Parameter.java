/* Parameter
{

    public Parameter(int a) 
    {
        System.err.println("hello para con");
        System.err.println(a);

    }
    public static void main(String[] args) {
       Parameter obj=new Parameter(5);
    }
    
}*/


/*class Student {
    String name;
    int age;
    Student(String n, int a) {
        name = n;
        age = a;
    }
}

public class Parameter {
    public static void main(String[] args) {
        Student s1 = new Student("Padma", 20);
        Student s2 = new Student("kavya", 22);

        System.out.println(s1.name + " " + s1.age);
        System.out.println(s2.name + " " + s2.age);
    }
}*/


class A
{
    A()
    {
        System.err.println("I am default con");
    }
    A(int a,String b)
    {
        new A();
        System.err.println("I am para Con");
        System.err.println(a);
        System.err.println(b);
    }
}
public class Parameter
{
    public static void main(String[] args) {
       // A obj=new A();
        //new A(10,"padma");
        A obj=new A(10,"padma");
    }
}



/*class A
{
    A()
    {
        System.err.println("I am default con");
    }
    A(int a,String b)                                                        //default con calling in side the para con
    {
        new A();
        System.err.println("I am para Con");
        System.err.println(a);
        System.err.println(b);
    }
}
public class Parameter
{
    public static void main(String[] args) {
        A obj=new A(10,"padma");
    }
}*/