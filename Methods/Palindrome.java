class Palindrome {
    static int isPalindrome(int n) {
        int m = n;    // store original
        int rev = 0;

        while (n > 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }

        if (rev == m) {
            return 1;   // palindrome
        } else {
            return 0;   // not palindrome
        }
    }

    public static void main(String[] args) {
        int n = 121;
        int result = isPalindrome(n);

        if (result == 1) {
            System.out.println(n + " is Palindrome");
        } else {
            System.out.println(n + " is NOT Palindrome");
        }
    }
}
