package Java_File;
import java.util.Scanner;
import java.util.regex.*;
public class PatternSyntax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int TestCases = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < TestCases; i++){
            try{
                
                String pattern = sc.nextLine();
                Pattern pat = Pattern.compile(pattern);
                Matcher m = pat.matcher("[^A-Za-z0-9]");
                boolean result = m.find();
                    
                if(result)
                {
                    System.out.println("Valid");
                } 
                
            }
            catch(PatternSyntaxException e){
                System.out.println("Invalid");
            }
        }
        sc.close();
    }
}
