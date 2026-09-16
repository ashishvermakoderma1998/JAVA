import java.lang.reflect.GenericArrayType;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }

    void sound(String type) {
        System.out.println("Animal sound:" + type);
    }

}

class Dog extends Animal {
    // Method Overriding(runtime polymorphism)

    @Override
    void sound(String type){
        System.out.println("Dog barking is:"+type);
    }
}

public class polymorphism {
    public static void main (String[] args){
        Animal a = new Animal();
        Dog myDog = new Dog(); //creating a object
        Animal polyMorphism = new Dog(); //upcasting
        
        // Method overloading
        a.sound();
        a.sound("Generic");
        // Method Overriding
        myDog.sound("Loud");
        // Performing the polyMorphism
        polyMorphism.sound(); 

    }
}
