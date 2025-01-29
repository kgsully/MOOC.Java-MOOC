
public class Main {

    public static void main(String[] args) {
        // you can test how your classes work here

        // Test Code - Part 1
        // Dog dog = new Dog();
        // dog.bark();
        // dog.eat();

        // Dog fido = new Dog("Fido");
        // fido.bark();

        // Test Code - Part 2
        // Cat cat = new Cat();
        // cat.purr();
        // cat.eat();

        // Cat garfield = new Cat("Garfield");
        // garfield.purr();

        // Test Code - Part 3
        NoiseCapable dog = new Dog();
        dog.makeNoise();

        NoiseCapable cat = new Cat("Garfield");
        cat.makeNoise();
        Cat c = (Cat) cat;
        c.purr();
    }

}
