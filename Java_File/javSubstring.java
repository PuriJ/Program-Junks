package Java_File;
import java.util.Scanner;

public class javSubstring {
    public static String getSmallestAndLargest(String s, int k){
        String currentStringS = s.substring(0, k);
        String smallest = currentStringS;
        String largest = currentStringS;

        for(int i = k; i < s.length(); i++){
            currentStringS = currentStringS.substring(1, k) + s.charAt(i);
            if(smallest.compareTo(currentStringS) > 0){
                smallest = currentStringS;
            }
            if(largest.compareTo(currentStringS) < 0){
                largest = currentStringS;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        sc.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
