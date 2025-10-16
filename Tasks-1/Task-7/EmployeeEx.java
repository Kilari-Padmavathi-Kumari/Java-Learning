class Employee {
    int method(int a, int b) {
        System.err.println("Employee method a value : " + a);
        System.err.println("b value : " + b);
        return a + b;
    }
}

class Manager extends Employee {
    @Override
    int method(int a, int b) {
        System.err.println("Manager method : " + super.method(3, 4));
        System.err.println("manager a value :"+a);
         System.err.println("manager b value :"+a);
        return a + b;
    }
}

class Developer extends Employee {
    @Override
    int method(int a, int b) {
        System.err.println("Developer method : " + super.method(1, 2));
         System.err.println("developer a value :"+a);
          System.err.println("developer b value :"+b);
        return a + b;
    }
}
public class EmployeeEx
{
    public static void main(String[] args) { 
    Manager m=new Manager();
    System.err.println("manager method : "+m.method(3,6));
    Developer d=new Developer();
    System.out.print("developer method : "+d.method(3,4));

    }
}
