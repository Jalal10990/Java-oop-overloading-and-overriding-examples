import java.lang.reflect.Method;

public class overriding {
    //  Method Overriding → Same method name in parent and child class.
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.sound(); // Calls parent method

        Dog myDog = new Dog();
        myDog.sound(); // Calls overridden method in Dog
    }
}
class Animal {
    void sound() {
        System.out.println("Animals make sounds...");
    }
}

// Child class overriding sound() method
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks...");
    }
}



