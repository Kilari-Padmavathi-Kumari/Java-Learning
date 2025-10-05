class Ifelse {
    public static void main(String[] args) {
        double billAmount = 1200;

        System.out.println("Your Bill Amount: " + billAmount);

        if (billAmount >= 1000) {
            System.out.println("Congratulations You get a 10% discount.");
            double discount = billAmount * 0.10;
            billAmount = billAmount - discount;
            System.out.println("Final Pay Amount: " + billAmount);
        } 
        else 
        {
            System.out.println("No discount available.");
            System.out.println("Final Pay Amount: " + billAmount);
        }
    }
}
