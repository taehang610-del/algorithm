
import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(PalindromeCheck(s,s.length()));
    }

    public static int PalindromeCheck(String s , int stringLength)
    {
        for (int i = 0 ; i < stringLength / 2 ; i++)
        {
            if ( s.charAt(i) != s.charAt(stringLength - 1 - i) )
            {
                return 0;
            }
        }
            return 1;
    }
}