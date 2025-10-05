class Regularcls
{
    int add(int a,int b)
    {
        System.err.println(a);
        System.err.println(b);
        return a+b;
    }
    public static void main(String[] args) {
        Regularcls obj=new Regularcls();
        System.err.println(obj.add(2,3));
    }
}