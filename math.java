import java.util.Scanner;

public class math {
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
 
String userName = "Ashish Kum Verma";
String city = "Koderma";
System.out.println("Hello " + userName + " from "+ city);

int x = 8;
int y = 4;
System.out.println("8 + 4 = " + (x + y));
System.out.println("8 - 4 = "+ (x - y));
System.out.println("8 * 4 = "+ (x * y));
System.out.println("8 / 4 = "+ (x / y));

System.out.println("Enter length: ");
double length = sc.nextDouble();
System.out.println("Enter Width: ");
double width = sc.nextDouble();
double area = length * width;
System.out.println("Area of Rectangle "+ area);

System.out.println("Enter Your Number: ");
int num = sc.nextInt();
System.out.println(num % 2 == 0 ? "Even":"Odd");

System.out.println("Enter Principal Amount: ");
double pAmt = sc.nextDouble();
System.out.println("Enter Rate of Intrest: ");
double roi = sc.nextDouble();
System.out.println("Enter Time in Year: ");
double tYear = sc.nextDouble();
System.out.println((pAmt * roi * tYear) / 100);


System.out.println("Enter Temprature in Celcius:");
int temp = sc.nextInt();
System.out.println((temp * 9 / 5)+ 32);


System.out.println("Enter Marks Range(0-100)");
double gMarks = sc.nextDouble();
if (gMarks < 0 || gMarks > 100 ) {
System.out.println("Invalid Input");
}

else if (gMarks >= 90){
System.out.println(gMarks + " Grade A");
}

else if (gMarks >= 75){
System.out.println(gMarks + " Grade B");
}

else if (gMarks >= 50){
System.out.println(gMarks + " Grade C");
}

else {
System.out.println("Fail");
}



System.out.println("Enter Your Student Name: ");
String sName = sc.next();
System.out.println("Enter Roll No:");
int rNumber = sc.nextInt();
System.out.println("Enter Hindi Marks:");
double hindi = sc.nextDouble();
System.out.println("Enter English Marks: ");
double english = sc.nextDouble();
System.out.println("Enter Math Marks:");
double math = sc.nextDouble();

double total = hindi + english + math;
double average = total / 3;

System.out.println(total);
System.out.println(average);






}

}