import java.util.Scanner;

public class Pattern_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        for (int i=n; i>=1; i--){
            for (int j=i; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
