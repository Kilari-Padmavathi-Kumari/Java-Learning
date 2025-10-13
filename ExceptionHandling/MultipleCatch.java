public class MultipleCatch
{
    public static void main(String[] args) {
        try{
            int input=10/0;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.err.println("ArithmeticException e"+e);
        }
       
        catch(ArithmeticException e)
        {
            System.err.println("correct exception");
        }
        catch(Exception e)
        {
            System.err.println("Exception e"+e);
        }
        finally{
            System.err.println("always run");
        }
    }
}

/*public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);  // causes ArrayIndexOutOfBoundsException
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception occurred");
        } 
        catch (Exception e) {
            System.out.println("Some other Exception occurred");
        }
    }
}
*/