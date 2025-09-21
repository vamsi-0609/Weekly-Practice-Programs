package Day3;
import java.util.*;
public class ExtendedPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] line = sc.nextLine().replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();
        boolean flag = true;
        for(int i = 0, j = line.length - 1; i <= j; i++, j--){
            if (line[i] != line[j]){
                flag = false;
                break;
            }
        }

        if (flag){
            System.out.println("Yes, this is a palindrome");
        }
        else{
            System.out.println("No, this is not a palindrome");
        }
    }

}
