
/*class Student {
    private String name;
    private int age;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {                           //using this keyword
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) 
        {
            this.age = age;
        } 
        else 
        {
            System.out.println("Age must be positive!");
        }
    }
}

public class Encapsu {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Padma");
        s.setAge(20);
        System.out.println("Student Name: " + s.getName());
        System.out.println("Student Age: " + s.getAge());
        s.setAge(-5); 
    }
}*/


public class Encapsu{
    private int age;
    private String name;
 
   public void setAge(int a)
   {
    age=a;
   }
   public void setName(String n)
   {
    name=n;
   }
   public String getName()
   {
    return name;
   }
   public int getAge()
   {
    return age;
   }
   public static void main(String[] args) {
       Encapsu obj=new Encapsu();
       obj.name="padma";
       System.err.println(obj.name);
       obj.age=23;
       System.err.println(obj.age);
       obj.setName("vijay");
       obj.setAge(34);
       System.err.println(obj.getName());
       System.err.println(obj.getAge());

   }
}