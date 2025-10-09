class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class UpCasting extends Animal {
    void sound() {
        super.sound();  // call parent method
        System.out.println("Dog barks");
    }
    public static void main(String[] args) {
       Animal d = new UpCasting();
        d.sound();
    }
}



