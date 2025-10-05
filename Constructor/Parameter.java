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


class Student {
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
}
