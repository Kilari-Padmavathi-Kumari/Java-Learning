class UnaryOperators {
    public static void main(String[] args) {
        int a = 5;      //0101
        boolean b = true;

        System.out.println("Initial value of a: " + a);
        System.out.println("Unary plus (+a): " + (+a));
        System.out.println("Unary minus (-a): " + (-a));
        System.out.println("Pre-increment (++a): " + (++a)); 
        System.out.println("Post-increment (a++): " + (a++)); 
        System.out.println("Value of a after post-increment: " + a);
        System.out.println("Pre-decrement (--a): " + (--a)); 
        System.out.println("Post-decrement (a--): " + (a--)); 
        System.out.println("Value of a after post-decrement: " + a);
        System.out.println("Logical NOT (!b): " + (!b)); 
        System.out.println("Bitwise complement (~a): " + (~a));    //1010 -(n+1)   -(5+1)=-6
    }
}
