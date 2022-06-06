package Java_File;
import java.util.Scanner;

public class reverseNumber {
    public static int reverseNum(int x){
        int number = x;

        if(x == 0)
            return 0;
            long reverse = 0;

        while(number != 0){
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println(reverse);
        
        if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
            return 0;
            }
            else
                return (int)reverse;
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        reverseNum(input);
        in.close();
    }
}
