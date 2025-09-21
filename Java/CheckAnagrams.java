package Day3;
import java.util.*;

public class CheckAnagrams {
    public static boolean areAnagrams(String one, String two){
        char[] cleaned1 = one.replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();
        char[] cleaned2 = two.replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();
        if (cleaned1.length != cleaned2.length){
            return false;
        }
        int[] alpha = new int[26];
        //Increase the count of chars
        for(int i = 0; i < cleaned1.length; i++){
            alpha[cleaned1[i] - 'a']++;
        }
        //Decrease the count of chars
        for(int i = 0; i < cleaned1.length; i++){
            alpha[cleaned2[i] - 'a']--;
        }

        //Check whether these strings are anagrams or not
        for(int num: alpha){
            if (num != 0){
                return false;
            }
        }

        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String 1: ");
        String one = sc.nextLine();
        System.out.print("Enter the String 2: ");
        String two = sc.nextLine();

        if (areAnagrams(one, two)){
            System.out.println("The two Strings are Anagrams");
        }
        else{
            System.out.println("The two strings are not Anagrams");
        }


    }

}
