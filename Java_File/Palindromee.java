package Java_File;
import java.util.Scanner;

public class Palindromee {
    public static boolean isPalindrome(int x){
        int number = x;
        long reverse = 0;

        if(x < 0){
            number = number * -1;
            
        }
        else{
        while(number != 0){
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
            }
        }

        if(x == reverse){
            return true;
        }
        else{
            return false;
        }
        
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int palin = in.nextInt();
        System.out.println(isPalindrome(palin));
        
        in.close();
    }
}
