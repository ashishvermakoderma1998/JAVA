public class method{

    // -------Create a method to print “Hello Java”--------
    public static void printMessage(){
        System.out.println("Hello World");
    }

// ---------Create a method to print your name.----------
public static void printName(){
    System.out.println("My name is Vikas");
}
// ----------------Create a method that accepts a name and prints a greeting.----------
public static void greet(String name){
    System.out.println("Hello " + name);
}
// ----------Create a method to add two numbers.----------
public static int addNumbers(int a, int b){
    return a + b;
}
// ----------Create a method to subtract two numbers.----------
public static int subtractNumbers(int a, int b){
    return a - b;
}

// ----------Create a method to calculate the square of a number.----------
public static int square(int num){
    return num * num;
}





public static void main(String[] args){
    printMessage();
    printName();
    greet("Ashish");





    // ----------Create a method to add two numbers.----------
    int num1 = 5;
    int num2 = 10;
    int result = addNumbers(num1, num2);
    System.out.println("sum " + num1 + " and " + num2 + " is " + result);

    // ----------Create a method to subtract two numbers.----------
    int num3 = 55;
    int num4 = 25;
    int result2 = subtractNumbers(num3, num4);
    System.out.println("difference " + num3 + " and " + num4 + " is " + result2);


// -------------Create a method to calculate the square of a number--------
int number = 7;
int squareResult = square(number);
System.out.println("square of " + number + " is " + squareResult);








// ----------write code inside this block--------------------
    }

}
















