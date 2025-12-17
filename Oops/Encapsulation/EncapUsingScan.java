import java.util.*;
class EncapUsingScan
{
    static Scanner sc=new Scanner(System.in);                      //using Scanner class
    private int age=20;
    private String name="padma";
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public static void main(String[] args) {
        EncapUsingScan obj=new EncapUsingScan();
        System.err.println(obj.age);
        System.err.println(obj.name);
        obj.setAge(sc.nextInt());                                               //input give using tab
        System.err.println("this is my new age :"+ obj.getAge());
        obj.setName(sc.next());
        System.err.println("this is my new name :"+ obj.getName());
    }
}