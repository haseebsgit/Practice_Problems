import java.util.Scanner;

public class Pattern_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        for (int i = 1; i<=n ; i++){
            for (int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            for (int j=0;j<i-1;j++){
                System.out.print(i-j-1);
            }
            System.out.println();
        }
        for (int i = 1; i<n ; i++){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=n-i;j++){
                System.out.print(j);
            }
            for (int j=1;j<=n-i-1;j++){
                System.out.print(n-j-1);
            }
            System.out.println();
        }
    }
}
