
class Ternary {
    public static void main(String[] args) {
        int a = 10, b = 20;

        // Using ternary to find maximum
        int max = (a > b) ? a : b;                                                  //condition ? expression1 : expression2
        System.out.println("Maximum value: " + max);

        // Check even or odd
        int num = 7;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is " + result);

        // Age check
        int age = 18;
        String eligibility = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println("Age " + age + ": " + eligibility);
    }
}
