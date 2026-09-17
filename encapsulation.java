// package oops;
/*Java program to demonstrate abstraction using 
an abstract class with both abtract and concrete methods.*/

class Student {
    //private data member
    private String name;
    //setter method for name
    public void setName(String name){
        this.name = name;
    }
    //getter method for name
    public String getName(){
        return name;
    }
}

public class encapsulation {
    public static void main(String[] args){
        Student s = new Student();
        //setting value in the name member
        s.setName("Vikas");
        //getting value of the name member
        System.out.println("Student Name:" + s.getName());
    }
}