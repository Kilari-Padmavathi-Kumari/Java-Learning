class Employee
{
    void work()
    {
        System.err.println("i am working in employee class");
    }
}
class Developer extends Employee
{
    void work()
    {
        super.work();
        System.err.println("i am working in Developer class");
    }
}
public class WorkOverride
{
    public static void main(String[] args) {
        Developer d=new Developer();
        d.work();
    }
}