
class Shape
{
     static void shapeall()
     {
         System.err.println("hi class shape");
     }
}
class Circle extends Shape{
     float circleArea(float r,float pi)
     {
        int c= (int)(r*pi);
        System.err.println("Circle Area : "+r);
        return c;
     }
}
class Rectangle extends Shape{
    int rectangleArea(int l,int w)
    {
        System.err.println("Rectangle Length : "+l);
        System.err.println("Rectangle width : "+w);
        return l*w;
    }

}
class Triangle extends Shape
{
    float triangleArea(float b,float h,float half)
    {
        int c=(int)(h*half +b*half);
        System.err.println("Triangle base : "+b);
        System.err.println("Triabgle hight : "+h);
        return c;
    }
}
public class Area
{
    public static void main(String[] args) {
        Circle obj=new Circle();
        Rectangle re=new Rectangle();
        Triangle te=new Triangle();
        obj.shapeall();
        System.err.println(obj.circleArea(3.0f,3.14f));
        System.err.println(re.rectangleArea(3,4));
        System.err.println(te.triangleArea(5.0f,6.0f,1.2f));
    }
}