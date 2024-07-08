import java.util.Scanner;

public class Pattern_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        for (int i=0; i<n; i++){
            for (int j=n-1-i; j>=1; j--){
                System.out.print(" ");
            }
            for (int j=1; j<=2*i+1;j++){
                System.out.print("*");
            }
            for (int j=n-1-i; j>=1; j--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
