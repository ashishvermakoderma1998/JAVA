public class pattern{
    public static void main(String[] args){

// -----------square pattern----------------
    int n = 5;
    for (int i = 1; i <= n; i++){
        for (int j = 1; j<= n; j++){
            if (i == 1 || i == n || j == 1 || j ==n) {
                System.out.print("*");

            }
            else {
                System.out.print(" ");
            
            }
        }
        System.out.println();
    }
        
// -----------number increasing pyramids------------------

int n1 = 5;
for (int i = 1; i <= n1; i++){
    for (int j = 1; j <= i; j++){
        System.out.print(j + " ");
    }
System.out.println();
}

System.out.println();
// ------------reverse number decreasing pyramids------------------
int n2 = 4;
for (int i = n2; i >= 1; i--){
    for (int j =1; j <= i; j++){
        System.out.print(j + " ");


    }
    System.out.println();
}


// ------------pyramid----------------
int n3 = 6;
for (int i = 1; i <= n3; i++) {
    for (int j = 1; j <= n3 - i; j++) {
        System.out.print(" ");      
}

for (int j = 1; j <= i; j++) {
    System.out.print(i + " ");
}
System.out.println();

}
// --------------Numer changing pyramid----------------
int n4 = 4;
int num = 1;
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(num + " ");
        num++;
    }
    System.out.println();
}

// --------------right angle triangle----------------
int n5 = 5;
for (int i = 1; i <= n5; i++) {
    int val  = (i % 2 == 1) ? 0 : 1;
    for (int j = 1; j <= i; j++) {
        System.out.print(val + " ");
        val = 1 - val;
    }

System.out.println();



}












// ---------------write code inside this line----------------

    }
}