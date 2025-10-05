
/*public class Elseladder {
    public static void main(String[] args) {
    int num = -1;
        if (num>=1) 
        {
            System.out.println("positive");                                     //simple example for understanding
        }
        else if(num==0)
        {
            System.err.println("zero");
        }
        else 
        {
            System.err.println("negative");
        }
    }
}*/



class Elseladder {
    public static void main(String[] args) {
        double billAmount = 2200;

        System.out.println("Your Bill Amount: " + billAmount);

        if (billAmount >= 2000)
        {
            System.out.println("You get a 20% discount!");
            billAmount = billAmount - (billAmount * 0.20);
        } 
        else if (billAmount >= 1000) 
        {
            System.out.println("You get a 10% discount!");
            billAmount = billAmount - (billAmount * 0.10);
        }
        else if (billAmount >= 500) 
        {
            System.out.println("You get a 5% discount!");
            billAmount = billAmount - (billAmount * 0.05);
        } 
        else 
        {
            System.out.println("No discount available.");
        }

        System.out.println("Final Payable Amount: " + billAmount);
    }
}

