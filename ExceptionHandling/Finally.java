public class Finally
 {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.err.println("index 2 value is : "+arr[2]);
            System.out.println("index 5 value is"+arr[5]);                // ArrayIndexOutOfBoundsException not executed
        } 
        catch (Exception e) {
            System.out.println("Error: Array index out of range!" +e );  // exception name
        } 
        finally {
            System.out.println("Finally block executed!");           // always executed
        }
    }
}
