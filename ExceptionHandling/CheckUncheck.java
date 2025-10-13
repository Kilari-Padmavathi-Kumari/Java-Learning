import java.io.*;

public class CheckUncheck {
    public static void main(String[] args) {                                                                                                                   
        try {                                                 //  Checked Exception
            FileReader fail = new FileReader("abc.txt");  // may throw FileNotFoundException   
        } catch (FileNotFoundException e) {
            System.out.println("Checked Exception: File not found!");
        }

        try {                                                                           // Unchecked Exception
            int a = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception: Division by zero!");
        }
    }
}
