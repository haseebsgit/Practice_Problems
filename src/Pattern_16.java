import java.util.Scanner;

public class Pattern_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        for (int i=0; i<n; i++){
            char ch = (char) ('A' + i);
            for (int j=0; j<=i;j++){
                System.out.print(ch+" ");
            }

            System.out.println();
        }
    }
}
