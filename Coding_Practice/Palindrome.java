package Coding_Practice;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String Arev = A.toLowerCase();
        sc.close();

        String rev = new StringBuilder(Arev).reverse().toString();

        if(A.toLowerCase().compareTo(rev) == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
