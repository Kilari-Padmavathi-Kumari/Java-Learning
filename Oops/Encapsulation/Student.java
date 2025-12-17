public class Student
{
    private String name;
    private int age;
    public Student(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public int updateAge(int newAge)
    {
       return this.age=newAge;
        
    }
    public void showDetails()
    {
        System.err.println(name+" "+age);
    }
    public static void main(String[] args) {
        Student s=new Student("padma",22);
        s.showDetails();
        System.err.println("After update age");
        s.updateAge(34);
        s.showDetails();
    }
}