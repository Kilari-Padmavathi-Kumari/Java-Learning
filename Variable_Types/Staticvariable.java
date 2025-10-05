class Nonstaticvariable
{
    static String name;
    static int age;
    static void display()
    {
        System.out.println("name :" + name);
        System.out.println("age :"+age);
    }
    public static void main(String[] args) {
        //Nonstaticvariable s1=new Nonstaticvariable();
        name="padma";
        age=23;
        display();
    }
}