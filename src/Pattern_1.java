import java.util.Scanner;

public class Pattern_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
