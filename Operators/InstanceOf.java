class Animal {
}

class Dog extends Animal {
}

class InstanceOf {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        System.out.println("a instanceof Animal: " + (a instanceof Animal)); 
        System.out.println("a instanceof Dog: " + (a instanceof Dog));       
        System.out.println("d instanceof Dog: " + (d instanceof Dog));       
        System.out.println("d instanceof Animal: " + (d instanceof Animal)); 
        Animal x = null;
        System.out.println("x instanceof Animal: " + (x instanceof Animal)); 
    }
}