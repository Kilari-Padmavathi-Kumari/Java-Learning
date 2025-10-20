public interface Playable
{
    public abstract void play();
    default void method()
    {
        System.err.println("i am default method in interface");
    }
    static String playing()
    {
        System.err.println("i am playing");
        return "ramu";
    }
}