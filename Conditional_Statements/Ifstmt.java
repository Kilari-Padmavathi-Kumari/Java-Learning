/*public class Ifstmt
{
    public static void main(String[] args)
    {
        int age=19;                                                      //if structure example
        if(age>=18)
        {
            System.out.print("right to vote");
        }
        else{
            System.out.println("not");
        }
    }
}*/


public class Ifstmt {
    public static void main(String[] args) {
        double balance = 5000;   
        double withdraw = 2000; 

        System.out.println("Account Balance: " + balance);
        System.out.println("Withdrawal Request: " + withdraw);

        if (withdraw <= balance) {
            balance = balance - withdraw;
            System.out.println("Withdrawal Successful!");
            System.out.println("Remaining Balance: " + balance);
        }

        if (withdraw > balance) {
            System.out.println("Insufficient Balance! Transaction Failed.");
        }
    }
}
