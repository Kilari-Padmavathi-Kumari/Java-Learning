import java.util.*;
public class AllMethods
{
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("padma");
        list.add("kavya");
        list.add("vijay");
        System.err.println(list);

        System.err.println(list.remove(0));   //remove index value
        System.err.println(list);

        System.err.println(list.set(1,"josh")); //change the index hold name 
        System.err.println(list);

        System.err.println(list.size());        // size of the list
        System.err.println(list);

        System.err.println(list.get(1));        //get (or) retrieve the value
        System.err.println(list);

        System.err.println(list.isEmpty());     //list empty (or) not result boolean
        System.err.println(list);

        System.err.println(list.contains("josh"));    //list contains that value (or) not  result boolean
        System.err.println(list);

        System.err.println(list.indexOf("josh"));      // indexof the value    result -> numbers (number not their given -1 value)
        System.err.println(list);

        System.err.println(list.lastIndexOf("kavya"));    //checked last index (number not their given 0)
        System.err.println(list);
        
    }
}