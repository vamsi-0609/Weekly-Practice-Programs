import java.util.*;
import java.io.*;
public class VCCount {
    public static int[] VowConCount(String word){
        char[] Vowels = {'a', 'e', 'i', 'o', 'u'};
        int vowels = 0, consonants = 0;
        for(char letter: word.toCharArray()){
            boolean flag = true;
            for(char vow :Vowels){
                if (letter == vow){
                    vowels++;
                    flag = false;
                    break;
                }
            }
            if (flag){
                consonants++;
            }
        }


        return new int[]{vowels, consonants};
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        int[] array = VowConCount(word);
        System.out.println("Vowels: " + array[0] + " Consonants: " + array[1]);


    }
}
