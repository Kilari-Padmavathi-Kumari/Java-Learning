/*class Default
{

    public Default()
    {
       System.err.println("hello default con");
    }
    public static void main(String[] args) {
        
        Default obj=new Default();
    
    }
}*/

class Student {
    String name;
    int age;
}

public class Default {
    public static void main(String[] args) {
        Student s = new Student();  
        System.out.println(s.name);
        System.out.println(s.age);  
    }
}
