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
    c2.brand="Mahindra";
    c2.model="Scorpio";
    c2.price= 2000000;

    c1.displayDetails();
    c2.displayDetails();





}
    
}