package Java_File;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int strCount = 0;
        for(int i = 0; i < (A.length() + B.length()); i++){
            strCount++;
        }
        System.out.println(strCount);

        if(A.compareTo(B) > 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1).toLowerCase() + " " + B.substring(0, 1).toUpperCase() + B.substring(1).toLowerCase());
        sc.close();
    }
}
