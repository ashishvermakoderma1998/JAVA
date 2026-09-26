package mini_project;
import java.util.Scanner;

abstract class Order {

    //Encapsulation(Data Hiding)
    private String customerName;
    private double amount;

    /*Constructor of order 
    It initializes customerName and foodAmount
    when an order/child object is created */

    Order(String customerName, double amount){
        this.customerName = customerName; //this.customerName is the instance variable.
        this.amount = amount;
    }

//OOP Concept:
//Encapsulation: The instance variables customerName and amount are private, and can only be accessed through public getter methods. This encapsulates the data and provides controlled access to it.
    public String getCustomerName() {
        return customerName;
    }

    public double getAmount() {
        return amount;
    }

    abstract double calculateTotalAmount(); //Abstract method to be implemented by subclasses
    
    public void displayOrder(){
        System.out.println("Order Details:");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Order Amount: " + amount);
        System.out.println("Total Amount: " + calculateTotalAmount());
    }

}

class DineIn extends Order {
    DineIn(String customerName, double amount) {
        super(customerName, amount);
    }

    double calculateTotalAmount() {
        return getAmount() + (getAmount() * 1.10); // 10% service charge
    }
}

class Takeaway extends Order {
    Takeaway(String customerName, double amount) {
        super(customerName, amount);
    }

    double calculateTotalAmount() {
        return getAmount() + 50; // 5% packaging charge
    }
}

class Delivery extends Order {
    Delivery(String customerName, double amount) {
        super(customerName, amount);
    }

    double calculateTotalAmount() {
        return getAmount() + 100; // 10% delivery charge
    }
}


public class resturent{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter customer name: ");
        String name = sc.nextLine();
        System.out.println("Select order type: ");
        System.out.println("1. Dine-in");
        System.out.println("2. Takeaway");
        System.out.println("3. Delivery");
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();

        System.out.println("Enter food amout: ");
        double amount = sc.nextDouble();

        Order order;
        if(choice == 1) {
            order = new DineIn(name, amount);
        } else if(choice == 2) {
            order = new Takeaway(name, amount);
        } else if(choice == 3) {
            order = new Delivery(name, amount);
        } else {
            System.out.println("Invalid choice!");
            return;
        }

        order.displayOrder();

        sc.close();

    }
}