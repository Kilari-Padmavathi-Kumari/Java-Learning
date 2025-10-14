
public class PhonePe implements Payment{
    double balance=500;
    public void AddAmount(double amount)
    {
        System.err.println("balance amount in your account : "+balance);
        balance=amount+balance;
        System.err.println("hello amount add total amount is : "+balance);
    }
    public void withdrawAmount(double amount)
    {
        if(balance>=amount)
        {
             System.err.println("balance amount in your account : "+balance);
             balance=balance-amount;
             System.err.println("Amount withdraw after remaining amount: "+balance);
        }
        else
        System.err.println("hello low balance you cannot withdraw");
    }
    public static void main(String[] args) {
        PhonePe obj=new PhonePe();
        obj.AddAmount(1000);
        obj.withdrawAmount(500);
        obj.withdrawAmount(3000);

    }
}
