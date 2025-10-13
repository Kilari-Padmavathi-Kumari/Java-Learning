import java.io.*;

public class AllExceptions {

    static void checkFile() throws IOException {
        throw new IOException("File missing!");
    }

    public static void main(String[] args) {
        try {
            checkFile();  // calling method that throws exception
        }
        catch (IOException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block executed.");
        }
    }
}
