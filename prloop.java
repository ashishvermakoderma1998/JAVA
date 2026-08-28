
import java.util.Scanner;
public class prloop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

System.out.println("=============================");
System.out.println("---------LOOP PRACTICE-------");
System.out.println("=============================");

// Print Numbers 1 to 10
// Write a Java program to print numbers from 1 to 10 using a for loop.
int i;
for(i = 0; i <= 10; i++){
    System.out.println(i);
}


// Print Even Numbers
// Print all even numbers between 1 and 50.
int a;
for(a = 2 ; a <= 50; a+=2){
    System.out.println(a);
}


// Print Odd Numbers
// Print all odd numbers between 1 and 50.

for (int b = 1; b <= 50; b+=2){
    System.out.println(b);
}

// Multiplication Table
// Take a number from the user and print its multiplication table from 1 to 10.
// Example: 5 × 1 = 5 ... 5 × 10 = 50
System.out.println("Enter Number:");
int n = sc.nextInt();

for(int c = 0; c <= 10; c++ ){
    System.out.println(n+" * "+ c +" = "+(n * c));
}

// Count Numbers Divisible by 3
// Print and count all numbers between 1 and 100 that are divisible by 3.

for(int d = 1; d <= 100; d++){
    if (d % 3 ==0 ) {
        System.out.println(d);
        d++;
    }
}



// Factorial of a Number
// Take a number n and calculate its factorial.
// Example: 5! = 120
// Reverse a Number
System.out.println("Enter fact No:");
int fn = sc.nextInt();
int fact = 1;
for(int e = 1; e <= fn; e++){
    fact = fact * e;
    
}
System.out.println(fact);


// ----------While-----------
// Print numbers from 1 to 10 using a while loop.

int f= 1;
while (f <= 10) {
    System.out.println(f);
    f++;
}

// Print Numbers 10 to 1
int g = 10;
while (g >= 0) {
    System.out.println(g);
    g--;
}


// Print Even Numbers

int h = 2;
while (h <= 20) {
    System.out.println(h);
    h+=2;
    
}

// Reverse a Number
// Reverse an integer using a while loop.
// Example: 1234 → 4321

System.out.println("Enter Reverse Number:");
int rnum = sc.nextInt();
int rev = 0;
while(rnum != 0){
int digit = rnum % 10;
rev = rev * 10 + digit;
rnum = rnum / 10;

}
System.out.println(rev);















// -----------------Write Code Inside this Line-----------------
    }
}
