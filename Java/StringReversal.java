import java.util.*;
import java.io.*;

public class StringReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word to reverse it: ");
        String word = sc.nextLine();
        char[] letters = word.toCharArray();
        for(int i = letters.length - 1; i >= 0; i--){
            System.out.print(letters[i]);
        }

        boolean flag = true;
        for(int i = 0, j = letters.length-1; i <= j; i++, j--){
            if (letters[i] != letters[j]){
                flag = false;
                break;
            }
        }
        System.out.println();
        if (flag){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }

}
