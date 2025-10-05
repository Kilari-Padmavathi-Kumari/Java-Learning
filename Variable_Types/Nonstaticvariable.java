class Nonstaticvariable
{
    String name;
    int age;
    void display()
    {
        System.out.println("name :" + name);
        System.out.println("age :"+age);
    }
    public static void main(String[] args) {
        Nonstaticvariable s1=new Nonstaticvariable();
        s1.name="padma";
        s1.age=23;
        s1.display();
    }
}






