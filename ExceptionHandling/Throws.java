/*public class Throws{
    static void checkAge(int age) throws Exception {
        if(age < 18) {
            throw new ArithmeticException("Not eligible");
        } else {
            System.out.println("Eligible");
        }
    }

    public static void main(String[] args) throws Exception {
        checkAge(15);
        System.out.println("Program ended");
    }
}*/

public class Throws {
    static void checkAge(int age) throws ArithmeticException {
        if(age < 18) {
            throw new ArithmeticException("Not eligible");
        } else {
            System.out.println("Eligible");
        }
    }

    public static void main(String[] args) {
        checkAge(15);
        System.out.println("Program ended");
    }
}

