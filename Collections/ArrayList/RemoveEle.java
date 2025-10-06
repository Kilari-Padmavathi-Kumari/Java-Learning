import java.util.*;
public class RemoveEle
{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.err.println(list);
        list.remove(2);
        System.err.println(list);

    }
}