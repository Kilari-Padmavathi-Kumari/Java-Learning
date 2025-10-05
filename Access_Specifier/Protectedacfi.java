class Parent {
    protected void display() {
        System.out.println("Protected method");
    }
}

class Protectedacfi extends Parent {
    void test() {
        display(); 
    }
    public static void main(String[] args) {
        Protectedacfi obj=new Protectedacfi();
        obj.test();
    }
}