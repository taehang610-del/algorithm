import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        for (int i = 0 ; i <= N - 1 ; i++)
        {
            for (int j = 1 ; j < N - i ; j++)
            {
                System.out.print(" ");
            }
            for (int k = 0 ; k < 2 * i + 1; k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = N - 1 ; i > 0 ; i--)
        {
            for (int j = N - i ; j > 0  ; j--)
            {
                System.out.print(" ");
            }
            for (int k = 2 * i - 1 ; k > 0 ; k--)
            {
                System.out.print("*");
            }
                System.out.println("");
        }
    }
}