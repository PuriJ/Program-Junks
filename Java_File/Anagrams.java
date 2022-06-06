package Java_File;
import java.util.Scanner;
import java.util.Arrays;

public class Anagrams {
    static boolean isAnagram(String a, String b){
        char[] ch_A = a.toCharArray();
        char[] ch_B = b.toCharArray();
        Arrays.sort(ch_A);
        Arrays.sort(ch_B);
        
        if(Arrays.equals(ch_A, ch_B) == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();

        boolean ret = isAnagram(a.toLowerCase(), b.toLowerCase());
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
