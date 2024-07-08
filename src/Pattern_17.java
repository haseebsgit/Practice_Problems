import java.util.Scanner;

public class Pattern_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        for (int i=0; i<n; i++){
            for (int j=n-i; j>1;j--){
                System.out.print(" ");
            }
            for (char ch='A';ch<='A'+ i;ch++){
                System.out.print(ch);
            }
            for (char ch='A';ch<='A'+ i-1;ch++){
                System.out.print(ch);
            }
            for (int j=i; j<n-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
