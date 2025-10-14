class Shape
{
     int area()
     {
        System.err.println("shape Area");
        return 0;
     }
}
class Circle extends Shape
{
     float area(float r,float pi)
     {
        int c= (int)(r*pi);
        System.err.println("Circle Area : "+r);
        return c;
     }
}
class Rectangle extends Shape{
    float area(int l,int w)
    {
        System.err.println("Rectangle Length : "+l);
        System.err.println("Rectangle width : "+w);
        return l*w;
    }

}
class Triangle extends Shape
{
    float area(float b,float h,float half)
    {
        int c=(int)(h*half +b*half);
        System.err.println("Triangle base : "+b);
        System.err.println("Triabgle hight : "+h);
        return c;
    }
}
public class Override
{
    public static void main(String[] args) {
        Circle obj=new Circle();
        Rectangle re=new Rectangle();
        Triangle te=new Triangle();
        obj.area();
        System.err.println(obj.area(3.0f,3.14f));
        System.err.println(re.area(3,4));
        System.err.println(te.area(5.0f,6.0f,1.2f));
    }
}