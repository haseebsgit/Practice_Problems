import java.util.Scanner;

public class Pattern_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=n-i;j<n-1;j++){
                System.out.print(" ");
            }
            for (int j=2*n-i; j>=i; j--){
                System.out.print("*");
            }
            for (int j=n-i;j<n-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
