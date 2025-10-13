public class TryBlock {
    public static void main(String[] args) {
        try {
            int a = 10 / 2;                              //must try with catch (Or) finally 
            System.out.println("Result = " + a);
        } finally {
            System.out.println("finally block executed");
        }
    }
}
