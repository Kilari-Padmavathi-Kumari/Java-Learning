final class Finalcls         //in final class like normal class but once we definr final we cannot extends the class
{
    int add(int a,int b)
    {
        System.err.println(a);
        System.err.println(b);
        return a+b;
    }
    public static void main(String[] args) {
        Finalcls obj=new Finalcls();
        System.err.println(obj.add(2,3));
    }
}