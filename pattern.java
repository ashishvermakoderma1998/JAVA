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














// ---------------write code inside this line----------------

    }
}