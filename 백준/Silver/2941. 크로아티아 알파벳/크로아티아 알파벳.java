
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String name = sc.nextLine();
        char[] stringArray =  name.toCharArray();
        int charCount = 0;

        for (int i = 0; i < stringArray.length; i++){
            if ( i != stringArray.length - 1){

                if ( stringArray[i] == 'c')
                {

                    if (stringArray[i+1] == '-' || stringArray[i+1] == '=')
                    {
                        charCount++;
                        i++;
                        continue;
                    }
                    charCount++;

                } else if ( stringArray[i] == 'd')
                {

                    if (stringArray[i+1] == '-')
                    {
                        charCount++;
                        i++;
                        continue;

                    } else if ( i+2 < stringArray.length && stringArray[i+1] == 'z' && stringArray[i+2] == '=')
                    {

                            charCount++;
                            i += 2;
                            continue;

                    }
                    charCount++;

                } else if ( stringArray[i] == 'l') {

                    if (stringArray[i+1] == 'j') {
                        charCount++;
                        i++;
                        continue;
                    }
                    charCount++;

                } else if ( stringArray[i] == 'n')
                {

                    if (stringArray[i+1] == 'j')
                    {
                        charCount++;
                        i++;
                        continue;
                    }
                    charCount++;

                } else if( stringArray[i] == 's' || stringArray[i] == 'z')
                {

                    if (stringArray[i+1] == '=')
                    {
                        charCount++;
                        i++;
                        continue;
                    }
                    charCount++;

                } else {
                    charCount++;
                }
            } else {
                charCount++;
            }
        }

        System.out.println(charCount);
    }
}
