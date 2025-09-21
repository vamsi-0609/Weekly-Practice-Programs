package Day3;
import java.util.*;
public class SubStringCheck {
    public static boolean issSubString(String text, String pattern){
        int n = text.length();
        int m = pattern.length();
        for(int i = 0; i < n - m; i++){
           boolean match = true;
            for(int j = 0; j < m; j++){
                if(text.charAt(i+j) != pattern.charAt(j)){
                    match = false;
                    break;
                }
            }
            if (match){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Main String 1: ");
        String text = sc.nextLine();
        System.out.println("Enter the pattern: ");
        String pattern = sc.nextLine();

        if (issSubString(text, pattern)){
            System.out.println("The text contains the substring ");
        }
        else{
            System.out.println("The text doesn't contains the substring ");
        }

    }
}
