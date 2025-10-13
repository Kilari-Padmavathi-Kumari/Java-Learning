public class NestedTry {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("Exception handled in main: " + e);
        }
    }

    static void method1() {
        try {
            try {
                int a = 5 / 0;  // ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: " + e);
            }

            int[] arr = new int[2];
            System.out.println(arr[5]);  // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: " + e);
        }
    }
}
