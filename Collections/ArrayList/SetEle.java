import java.util.*;
public class SetEle
{
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("padma");
        list.add("vijay");
        list.add("kavya");
        System.err.println(list);
       System.err.println(list.set(0,"kumari"));
       System.err.println(list);
    }
}