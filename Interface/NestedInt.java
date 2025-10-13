interface I {
    interface I1{
        void msg();
    }
}

class Demo implements I.I1 {
    public void msg() {
        System.out.println("Inner Interface implemented");
    }
}

public class NestedInt {
    public static void main(String[] args) {
        I.I1 obj = new Demo();
        obj.msg();
    }
}
