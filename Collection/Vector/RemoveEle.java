

/*import java.util.List;
import java.util.Vector;

public class RemoveEle {
    public static void main(String[] args) {
        List<String> ve=new Vector<>();
        ve.add("padma");
        ve.add("josh");
        ve.add("kavya");
        ve.add("vedha");
        System.err.println(ve);

        System.err.println(ve.remove(0));
        //System.err.println(ve.remove(5));                                    //error Array index out of range
        System.err.println(ve);

        System.err.println(ve.remove("josh"));
        System.err.println(ve);
    }
}*/

import java.util.*;

public class RemoveEle {
public static void main(String[] args) {
        List<String> ve=new Vector<>();
        ve.add("padma");
        ve.add("josh");
        ve.add("kavya");

         List<String> nve=new Vector<>();
         nve.add("bujji");
         nve.add("vedha");
         System.err.println("Before adding new ele : "+ve);
          ve.addAll(nve);
         System.err.println("After adding new ele : "+ve);

         ve.removeAll(nve);
         System.err.println("remove new ele : "+ve);
}
}