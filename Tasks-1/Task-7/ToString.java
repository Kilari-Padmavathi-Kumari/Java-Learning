class Employee
{
    String name="Employee";
    public String toString()
    {
        System.err.println("my name is : "+name);
        return "ramu";
    }
    
}
class Manager extends Employee
{
    String name="manager";
    @Override
    public String toString()
    {
        System.err.println("manager instance variable : "+this.name);
        System.err.println("parent class Instance variable : "+super.name);
        System.err.println("parent method : "+super.toString());
        return "josh";
    }

}
class Developer extends Employee
{

    String name="developer";
    @Override
    public String toString()
    {
        System.err.println("developer instance variable : "+this.name);
        System.err.println("parent class Instance variable : "+super.name);
        System.err.println("parent method : "+super.toString());
        return "padma";
    }
    

}
public class ToString
{
 public static void main(String[] args) {
      Manager m=new Manager();
      System.err.println("manager method : "+m.toString());
      Developer d=new Developer();
      System.err.println("developer method : "+d.toString());
 }
}