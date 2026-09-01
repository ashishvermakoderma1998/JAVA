 class Car {

String brand;
String model;
int year;
}


class MobilePhone {
    String brand;
    double price;
    

}

public class probject {
    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.brand = "Ertiga";
        myCar.model = "VXI";
        myCar.year = 2024;

        System.out.println("Brand " + myCar.brand);
        System.out.println("Model " + myCar.model);
        System.out.println("Year " + myCar.year);

// ---------------MobilePhone-----------------
MobilePhone phone1 = new MobilePhone();
        phone1.brand = "Apple";
        phone1.price = 8999;


MobilePhone phone2 = new MobilePhone();
phone2.brand = "Samsung";
phone2.price = 9999;

System.out.println("phone 1 :" + phone1.brand +  phone1.price);
System.out.println("phone 2: " + phone2.brand + phone2.price);





    }

}