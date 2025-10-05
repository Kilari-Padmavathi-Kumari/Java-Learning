public class Nestedif {
    public static void main(String[] args) {
        double balance = 6000;    
        double withdraw = 4800; 
        double minBalance = 1000;

        System.out.println("Account Balance: " + balance);
        System.out.println("Withdrawal Request: " + withdraw);

        if (withdraw <= balance) {
            double remaining = balance - withdraw;
            if (remaining >= minBalance) {
                balance = remaining;
                System.out.println("Withdrawal Successful!");
                System.out.println("Remaining Balance: " + balance);
            } 
            else
             {
                System.out.println("Cannot withdraw"+ minBalance );
             }
        } 
        else 
        {
            System.out.println("Insufficient Balance! Transaction Failed.");
        }
    }
}
