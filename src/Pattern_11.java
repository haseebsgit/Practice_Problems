import java.util.Scanner;

public class Pattern_11 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        for (int i=1; i<=n; i++){
                for (int j=1; j<=i;j++){
                    if (i%2!=0 && j%2!=0) System.out.print("1 ");
                    else if (i%2!=0 && j%2==0) System.out.print("0 ");
                    else if (i%2==0 && j%2!=0) System.out.print("0 ");
                    else if (i%2==0 && j%2==0) System.out.print("1 ");

                }
                System.out.println();
            }
        }
    }

