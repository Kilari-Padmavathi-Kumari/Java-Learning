interface Nopara{
    void dog();
    default void cat()
    {
        System.err.println("cat sleeping");
    }
    public static void main(String[] args)
    {
        Nopara obj=() ->{
        System.err.println("hello");};
        obj.dog();
        obj.cat();
    }
}