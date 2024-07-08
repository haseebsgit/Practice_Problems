import java.util.Scanner;

public class Pattern_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        int space = 2*(n-1);
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            for (int j=1; j<=space;j++){
                System.out.print(" ");
            }
            space-=2;

            for (int j=i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
