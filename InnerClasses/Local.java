class Local
{
    int a=10;
    float method(float a)
    {
        System.err.println("method a val :"+a);
       class Inner
       {
          int method1(int a)
            {
                System.err.println("method1 a val : "+a);
                return a;
            }
       }  
        
        Inner obj1=new Inner();
        System.err.println(obj1.method1(2));
        return a;
       
    }
    
    public static void main(String[] args) {
        { 
            Local obj=new Local();
            System.err.println("instance val a : "+obj.a);
            System.err.println(obj.method(1.2f));
        }
    }
}