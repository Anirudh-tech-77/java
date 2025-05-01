public class forth {
    public static void main(String[] args) {
        
    }
    
}
//base class
class Animal{
    String color;
    void eats() {
        System.out.println("eats");
    }
    void breathe() {
        System.out.println("breathe");
    }
    
}
class Mammal extends Animal {
    void walk() {
        System.out.println("walk");
    }
}
class Fish extends Animal {
    void Swim() {
        System.out.println("Swim");
    }
}
class Bird extends Animal {
    void Fly() {
        System.out.println("Fly");
    }
}

