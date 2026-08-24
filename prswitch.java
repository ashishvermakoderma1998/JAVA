import java.time.Year;
import java.util.Scanner;

public class prswitch {
   public static void main(String[] args){
      Scanner storeInput = new Scanner(System.in);

      System.out.println("============================");
      System.out.println("   WELCOME TO JAVA CODING   ");
      System.out.println("============================");

      // --------Making Lootery----------
      System.out.println("Enter Your Lucky No (1-6):");
      int lucky = storeInput.nextInt();

      switch (lucky) {
         case 1: 
         System.out.println("Better Luck Next Time");
            break;
         case 2:
            System.out.println("You Won Iphone 17");
            break;
         case 3:
            System.out.println("Better Luck Next Time");
            break;
         case 4:
            System.out.println("You Won Motorola Phone"); 
            break;
         case 5:
            System.out.println("Better Luck Next Time");
            break;
         case 6:
            System.out.println("You won Hp Laptop");
            break;

         default:
            System.out.println("You Entered Invalid No ");
            break;
      }

      // 8. Discount calculator If purchase amount > 1000, apply a 10% discount.
         System.out.println("Enter Valid Purchase Amount");
         double amount = storeInput.nextDouble();
         double discount =(amount > 1000) ? amount * 0.10 : 0;

         System.out.println("Purchase Amount " + amount);
         System.out.println("Discount Amount " + discount);
         System.out.println("Final Amount " + (amount - discount));


         // 10. Login validation Check a username and password using .equals() and &&.

         System.out.println("Enter username:");
         String uN = storeInput.next();
         System.out.println("Enter Password:");
         String uP = storeInput.next();

         String result = (uN.equals("Ashish") && uP.equals("Ashish@1998"))  ? "Login Successfully" : "Invalid Username and Password";
         System.out.println(result);


            //   Question 2.
            // Write a Java program to find out the day of the week given the number [1] for Monday, [2] for Tuesday, and so on.

         System.out.println("Enter Your Day No :");
         int day = storeInput.nextInt();
         switch (day) {
            case 1-> System.out.println("Monday");
            case 2-> System.out.println("Tuesday");
            case 3-> System.out.println("Wednesday");
            case 4-> System.out.println("Thursday");
            case 5-> System.out.println("Friday");
            case 6-> System.out.println("Saturday");
            case 7-> System.out.println("Sunday");

            default-> System.out.println("Please Input Valid Input 1-7");
         
         }

      //    Question 3.
      // Write a Java program to find whether a year entered by the user is a leap year or not.

      System.out.println("Enter Year");
      int year = storeInput.nextInt();
      System.out.println(year + " " + (Year.isLeap(year) ? "is Leap Year" : "Not a Leap Year"));



      System.out.println("Enter Year");
      int leapYear = storeInput.nextInt();
      if (leapYear % 4 == 0 && leapYear % 100 != 0 || (leapYear % 400 == 0)) {
         System.out.println(leapYear + " "+ "This is leapYear");
      }
      else  {
         System.out.println(leapYear +" " + "This is Not leapYear");
      }

   }
}