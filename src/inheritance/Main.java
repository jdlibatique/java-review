package inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        System.out.println("Animal Name: " + animal.getName());

        Dog dog = new Dog("Yorkshire Terrier", 8, 20, 2, 4, 1, 20, "Long Silky" );
        System.out.println("Dog name: " + dog.getName());
        dog.eat();
//        dog.walk();
        dog.run();


    }
}
