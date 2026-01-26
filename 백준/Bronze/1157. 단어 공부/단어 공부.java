import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        string = string.toUpperCase();

        char[] stringArray = string.toCharArray();
        int[] countArray = new int[26];

        int max = 0;
        int check = 0;
        char checkChar = 0;


        for (int i = 0 ; i < stringArray.length; i++) {
            countArray[stringArray[i] - 'A']++;
        }

        for (int i = 0 ; i < countArray.length; i++) {
            if (countArray[i] > max) {
                max = countArray[i];
                check = i;
            }
        }

        for (int i = 0 ; i < countArray.length; i++) {
            if (i != check) {
                if (countArray[i] == max) {
                    checkChar = '?';
                }
            }
        }

        if (checkChar != '?')
        {
            checkChar = (char)(check + 'A');
        }

        System.out.println(checkChar);

    }
}