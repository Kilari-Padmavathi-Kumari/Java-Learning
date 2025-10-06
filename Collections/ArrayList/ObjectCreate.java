/*import java.util.ArrayList;

public class ObjectCreate {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        
        Object[] arr = fruits.toArray();                        // Convert to Object array           not safe

        System.out.println("Array Elements:");
        for (Object fruit : arr) {                               //using enhanced for loop
            System.out.println(fruit);
        }
    }
}*/






import java.util.ArrayList;

public class ObjectCreate {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");

    
        String[] arr = fruits.toArray(new String[0]);                   // or new String[fruits.size()]     safe

        System.out.println("String Array:");                                
        for (String fruit : arr) {
            System.out.println(fruit);
        }
    }
}

