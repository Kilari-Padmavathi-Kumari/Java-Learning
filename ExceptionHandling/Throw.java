/*public class Throw
{
    public static void main(String[] args) throws Exception {
        int age=16;
        if(age<18)
        {
             throw new Exception("not eligible to vote");               //without declare Exception name
        }
        else{
            System.err.println("eligible to vote");
        }
    }
}*/

public class Throw {
    public static void main(String[] args) {
        int age = 15;
        if(age < 18) {
            throw new ArithmeticException("Not eligible to vote");     //with Exception name
        } else {
            System.out.println("Eligible to vote");
        }
    }
}



