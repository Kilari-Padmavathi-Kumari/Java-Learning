public interface Employee
{
     void employee();
}
public interface Manager
{
    void manager();
}
public interface Developer
{
    void developer();
}

public class MultiInterface implements Employee,Manager,Developer
{
    public void employee()
    {
        System.err.println("employee cls");
    }
    public void manager()
    {
        System.err.println("manager cls");
    }
    public void developer()
    {
        System.err.println("developer cls");
    }
    public static void main(String[] args) {
        MultiInterface m=new MultiInterface();
        m.employee();
        m.manager();
        m.developer();
    }
}