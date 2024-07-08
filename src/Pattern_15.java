import java.util.Scanner;

public class Pattern_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        for (int i=n; i>=1; i--){
            for (char ch = 'A'; ch<='A'+ i-1; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
