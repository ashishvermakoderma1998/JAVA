import java.util.Scanner;

public class prwhile{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ashish");

//         Count Even and Odd Digits
// Given a number, count how many digits are even and how many are odd.
// Example: 123456 → Even = 3, Odd = 3

System.out.println("Enter Number(Count Even or Odd):");
long n = sc.nextLong();
long even = 0,  odd = 0;
while (n != 0) {
    long digit = n % 10;
    if (digit % 2 == 0) {
        even++; }
    else{
        odd++;
    }
    n = n/10;
}

System.out.println("Total Even No " + even +"  "+ "Total odd no "+ odd);

// Sum of Even Digits
// Find the sum of only the even digits.
// Example: 123456 → 2 + 4 + 6 = 12
System.out.println("Enter Number (Sum of Even):");
long num = sc.nextLong();
long sumEven = 0;
while (num != 0) {
long digit = num % 10;
  if (digit % 2 == 0) {
    sumEven+= digit;
  }  
num /= 10;
}
System.out.println("sum of Even No "+ sumEven);

// Sum of Odd Digits
// Find the sum of only the odd digits.
// Example: 12345 → 1 + 3 + 5 = 9

System.out.println("Enter Number(sum of odd):");
long no = Math.abs(sc.nextLong());
long sumOdd = 0;
while (no != 0) {
    long rem = no % 10;
    if (rem % 2 != 0 ) {
        sumOdd += rem;
    }
    no /= 10;
}
System.out.println("sum of odd No: "+sumOdd);

// Largest Digit Find the largest digit in a number.Example: 58392 → 9
System.out.println("Enter Number(Max No):");
long lno = Math.abs(sc.nextLong());
long maxDigit = 0;
while (lno != 0) {
    long rem = lno % 10;
if (rem > maxDigit) {
    maxDigit= rem;
}
lno /= 10;

}
System.out.println("Largest No "+maxDigit);

// Smallest Digit Find the smallest digit in a number. Example: 58392 → 2
System.out.println("Enter Number(Min No):");
long sno = Math.abs(sc.nextLong());
long minDigit = 0;
while (sno != 0) {
    long rem = sno % 10;
    if (rem < maxDigit) {
        minDigit = rem;
    }
    sno /= 10; 
    
    }
System.out.println("Smallest No: "+minDigit);

// Count a Particular Digit Given a number and a digit, count how many times that digit occurs. Example: 1223332, digit 3 → 3 times
System.out.println("Enter Number (Repeated No):");
long rno = Math.abs(sc.nextLong());

System.out.println("Check Number:");
long target = sc.nextLong();

long count = 0;

while (rno != 0) {
    long rem = rno % 10;
    if (rem == target) {
        count++;
    }
    rno /= 10;
}
System.out.println("Result " +count+" Times");

// Product of Digits Find the product of all digits.Example: 234 → 2 × 3 × 4 = 24
System.out.println("Enter Number(Multiple of all No):");
long prNum = Math.abs(sc.nextLong());
long product = 1;
while (prNum != 0) {
    long rem = prNum % 10;
    product *= rem;
    prNum /= 10;
}
System.out.println("Multiple of all No: "+product);

// First and Last Digit Print the first and last digit of a number. Example: 12345 → First = 1, Last = 5
System.out.println("Enter Number (First and Last Digit)");
long flno = Math.abs(sc.nextLong());
long lastDigit = flno % 10;
long firstDigit = flno;

while (firstDigit >= 10) {
    firstDigit /= 10;
}

System.out.println("First Digit "+firstDigit+" last digit "+lastDigit);

// Difference Between Sum of Even and Odd Digits Example: 123456 Even sum = 12, odd sum = 9 Difference = 3
System.out.println("Enter Number(diff of sum of even and sum of odd):");
long diffno = Math.abs(sc.nextLong());

long evenNum = 0;
long oddNum = 0;
while (diffno != 0) {
    long rem = diffno % 10;
    if (rem % 2 == 0) {
        evenNum += rem;
    }
    else {
        oddNum += rem;
    }
    diffno /= 10;
}

long diff = Math.abs(evenNum - oddNum); 
System.out.println("sum of even: "+ evenNum+" sum of odd: "+oddNum);
System.out.println("diffrence of sum of even or Sum of Odd: "+ diff);

// Number of Zeros Count how many 0s are present in a number. Example: 10203040 → 4
System.out.println("Enter Number(Check Zero)");
long zNum = Math.abs(sc.nextLong());
long zeroCount = 0;
while (zNum != 0) {
    long rem = zNum % 10;
    if (rem == 0) {
        zeroCount++;
    }
    zNum /= 10;
}
System.out.println("Count of Zero "+ zeroCount);


// ------------Write Code inside this ---------------
    }
}