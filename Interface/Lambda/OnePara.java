interface OnePara{
    int dog(int a);
    default void cat()
    {
        System.err.println("cat sleeping");
    }
    public static void main(String[] args)
    {
        OnePara obj=(a) ->{
        System.err.println(a);
        System.err.println("hello");
        return a;
        };
        System.err.println(obj.dog(4));
        obj.cat();
    }
}