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
        String sum=a+b;
        System.err.println("hello");
        System.err.println(a);
        System.err.println(b);
        return sum;
        };
        System.err.println(obj.dog("padma","kumari"));
        MultiplePara.cat();
    }
}