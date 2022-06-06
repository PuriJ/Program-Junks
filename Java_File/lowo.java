package Java_File;
import java.util.Scanner;

public class lowo {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        int start = inp.nextInt();
        int end = inp.nextInt();
        inp.close();

        System.out.println(s.subSequence(start, end));
    }    
}
