interface MultiplePara
{
    String dog(String a,String b);
    static void cat()
    {
        System.err.println("cat sleeping");
    }
    public static void main(String[] args)
    {
        MultiplePara obj=(a,b) ->{
        System.err.println("hello");
        System.err.println(a);
        System.err.println(b);
        return a+b;
        };
        System.err.println(obj.dog("padma","kumari"));
        MultiplePara.cat();
    }
}