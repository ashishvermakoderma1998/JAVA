/*Q1. Student Class
Create a Student class with: name, age, course
Create two student objects and display their details.
Expected concepts: Class, Object, Instance Variables, Method*/

class Student {
    String name;
    int age;
    String course;

        void displayDetails(){
            System.out.println("name:"+ name);
            System.out.println("age:"+ age);
            System.out.println("course:"+ course);
            System.out.println();
        }
}

/*Q2. Car Class
Create a Car class with:
brand, model, price
Create two different car objects and display their details.
Expected concepts: Multiple objects from the same class.*/

class Car {
    String brand;
    String model;
    double price;

    void displayDetails(){
        System.out.println("brand:"+ brand);
        System.out.println("model:"+ model);
        System.out.println("price:"+price);
        System.out.println();

    }
}

public class  ashish {
public static void main(String[] args){
    // First Student Object
    Student s1 = new Student();
    s1.name ="Ashish";
    s1.age = 27;
    s1.course = "java";

    // Second Student Object
    Student s2 = new Student();
    s2.name ="Vikash";
    s2.age = 27;
    s2.course = "PHP";

    s1.displayDetails();
    s2.displayDetails();


   


    // First Car Object
    Car c1 = new Car();
    c1.brand= "Hyundai";
    c1.model= "Verna";
    c1.price= 900000;

    // Second Car Object
    Car c2 = new Car();
    c2.brand="TATA";
    c2.model="Sa";
    c2.price= 2000000;

    c1.displayDetails();
    c2.displayDetails();





}
    
}