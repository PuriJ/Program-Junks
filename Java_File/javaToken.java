package Java_File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class javaToken {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().replaceAll("[^A-Za-z0-9]", " ").replaceAll("\\s+", " ");
        StringTokenizer st = new StringTokenizer(s);
        int count = st.countTokens();
        System.out.println(count);
        for(int i = 0; i < count; i++){
            System.out.println(st.nextToken());
        }
        sc.close();
        
    }
}
