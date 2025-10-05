
class Logical {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x : " + (!x));
        System.out.println("!y : " + (!y));
        int age = 25;
        int marks = 70;

        if (age > 18 && marks > 60) 
        {
            System.out.println("Eligible for job");
        } 
        else 
        {
            System.out.println("Not eligible for job");
        }
    }
}
