public class Student
{
     int marks;
    void callReference(Student e)                     //obj as a parameter
    {
        marks=marks+30;
    }
    public static void main(String[] args) {
        Student obj=new Student();
         obj.marks=10;
        System.err.println("Before :"+ obj.marks);
        obj.callReference(obj);
        System.err.println("after :"+obj.marks);
    }
}