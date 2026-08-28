import java.util.Scanner;

public class scanner {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        // ---Take the user's name and city as input, then print: "Hello <name> from
        // <city>!"----

        //  System.out.println("Enter Your Name: ");
        // String name = sc.nextLine();
        // System.out.println("Enter Your City:");
        // String city = sc.nextLine();

        // System.out.println("Hello " + name + " From: " + city);

        // // Take two integers as input and print their sum, difference, product, and
        // // quotient.

        // System.out.println("Enter First Number:");
        // double FirstNumber = sc.nextDouble();
        // System.out.println("Enter Second Number:");
        // double SecondNumber = sc.nextDouble();

        // double sum = FirstNumber + SecondNumber;
        // double sub = FirstNumber - SecondNumber;
        // double mul = FirstNumber * SecondNumber;

        // System.out.println(sum);
        // System.out.println(sub);
        // System.out.println(mul);

        // // Area of a Rectangle take length and breadth (as doubles) from the user and
        // // calculate the area.

        // System.out.println("Enter Rectangle Length:");
        // double length = sc.nextDouble();
        // System.out.println("Enter Rectangel Width:");
        // double width = sc.nextDouble();

        // double area = length * width;
        // System.out.println(area);

        // /*
        //  * Even or Odd
        //  * Take an integer as input and print whether it is even or odd.
        //  */
        // System.out.println("Enter Number:");
        // double Number = sc.nextDouble();
        // System.out.println(Number % 2 == 0 ? "Even" : "Odd");

        // /*
        //  * Simple Interest Calculator
        //  * Take principal, rate, and time (all doubles) as input and calculate simple
        //  * interest using:
        //  * SI = (P * R * T) / 100
        //  */

        // System.out.println("Enter Principal:");
        // double principal = sc.nextDouble();
        // System.out.println("Enter ROI Per Year:");
        // double roi = sc.nextDouble();
        // System.out.println("Enter Time in Year:");
        // double time = sc.nextDouble();

        // double SI = (principal * roi * time) / 100;

        // System.out.println(SI);

        // /*
        //  * Temperature Converter
        //  * Take temperature in Celsius as input and convert it to Fahrenheit using:
        //  * F = (C * 9/5) + 32
        //  */
        // System.out.println("Enter Temperature in Celsius");
        // double Celsius = sc.nextDouble();
        // double Fahrenheit = (Celsius * 9 / 5) + 32;
        // System.out.println("Temperature in Fahrenheit: " + Fahrenheit);

        // /*
        //  * Grade Calculator
        //  * Take marks (0–100) as input and print the grade based on this logic:
        //  * 
        //  * ≥ 90 → "A"
        //  * 75–89 → "B"
        //  * 50–74 → "C"
        //  * below 50 → "Fail"
        //  */

        // System.out.println("Enter Your Marks(0-100):");
        // double marks = sc.nextDouble();
        // if (marks < 0 || marks > 100) {
        //     System.out.println("Invalid input! enter Marks between 0 to 100");
        // }

        // else {

        //     if (marks >= 90) {
        //         System.out.println("Grade: A");
        //     }

        //     else if (marks >= 75) {
        //         System.out.println("Grade: B");
        //     }

        //     else if (marks >= 50) {
        //         System.out.println("Grade: C");
        //     }

        //     else {
        //         System.out.println("Fail");
        //     }

        // }
        

        // /*
        //  * Student Details
        //  * Take a student's name, roll number, and marks in 3 subjects as input, then
        //  * print their name, roll number, total marks, and average.
        //  */

        //      System.out.println("Enter Student Name:");
        //     String studentName = sc.nextLine();
            
        //     System.out.println("Enter Student Roll No:");
        //     int studentRollno = sc.nextInt();

        //     System.out.println("Enter Hindi Marks");
        //     double hindi = sc.nextDouble();

        //     System.out.println("Enter English Marks:");
        //     double english = sc.nextDouble();

        //     System.out.println("Enter Math Marks:");
        //     double math = sc.nextDouble();

        //     double total = hindi + english + math;
        //     double average = total / 3.0;

        //     System.out.println(studentName + " " + studentRollno + " "+ total +" " + average);


        // ----------10August-----------

        // Q1. Write a Scanner-based program that reads a person's age using nextInt() and prints "Adult" if the age is 18 or
        // above, otherwise prints "Minor"

        System.out.println("Enter Person age:");
        double personAge = sc.nextDouble();
        if (personAge > 18) {
            System.out.println("Adult");
            
        }

        else{
            System.out.println("Minor");
        }

            // Q2. Take a number from the user and print whether it is positive, negative, or zero.
            
            System.out.println("Enter Number");
            double checkNumber = sc.nextDouble();

            if (checkNumber > 0) {
                System.out.println("Positive Number");
            }
            else if (checkNumber < 0){
                System.out.println("Negative Number");
            }

            else {
                System.out.println("Zero");
            }

            // Take a number and print whether it is even or odd using the % operator.
            
            System.out.println("Enter Valid Number");
            int validNumber = sc.nextInt();
            System.out.println(validNumber % 2 == 0 ? "Even" : "Odd");


            // Q4. Take marks as input and print "Pass" if marks are 40 or above, otherwise print "Fail".

            System.out.println("Enter Marks:");
            int passMarks = sc.nextInt();
            System.out.println(passMarks > 40 ? "Pass" : "Fail");


            //  Take two numbers from the user and print the larger of the two.


            System.out.println("Enter First Number");
            int firstNumber1 = sc.nextInt();
            System.out.println("Enter Second Number");
            int secondNumber1 = sc.nextInt();
            System.out.println(firstNumber1 > secondNumber1 ? firstNumber1 : secondNumber1);

            // Take three numbers from the user and print the greatest of the three.

            System.out.println("Enter First Number:");
            int firstNumber2 = sc.nextInt();
            System.out.println("Enter Second Number");
            int secondNumber2 = sc.nextInt();
            System.out.println("Enter Third Number");
            int thirdNumber2 = sc.nextInt();
            if (firstNumber2 >= secondNumber2 && firstNumber2 >= thirdNumber2) {
                System.out.println(firstNumber2);
            }

            else if (secondNumber2 >= thirdNumber2 && secondNumber2 >= firstNumber2) {
                System.out.println(secondNumber2);
            }

            else {
                System.out.println(thirdNumber2);
            }


            // Write an ATM withdrawal check: allow the withdrawal only if pinCorrect is true AND balance >= amount.

            System.out.println("Enter Withdrawal Amount:");
            int amount = sc.nextInt();
            System.out.println("Enter ATM Pin:");
            int enterpin = sc.nextInt();
            int balance = 10000;
            int pinCorrect = 8709;

            boolean checkpin = (enterpin == pinCorrect);
            
            if (checkpin && balance >= amount) {
                System.out.println("Withdrawal Successful");
            }

            else {
                System.out.println("Withdrawal Faield");
            }

           /*  12. Write an exam-entry validator using nested if: entry is allowed only if the student has a hall ticket AND an ID
            card.*/

            System.out.println("Do You Have a Hall Ticket(true/false):");
            boolean hasTicket = sc.nextBoolean();
            System.out.println("Do You Have a ID card(true/false):");
            boolean hasId = sc.nextBoolean();


            if (hasId) {

                if (hasTicket) {
                    System.out.println("Entery Allowed");
                    
                }
                else {
                    System.out.println("Enter Denied No Ticket");
                }
                
            }
            else {
                System.out.println("Entery Denied No Id");
            }

           /*  14. Challenge: categorize a given temperature as "Cold" (below 15), "Warm" (15–30), or "Hot" (above 30) using
            else-if.*/
            System.out.println("Enter Temperature");
            int temp = sc.nextInt();
            System.out.println(temp >= 15 ? "Warm" : "Cold");

            


    }

}
