package Day3;

import java.util.*;

public class CharFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();

        System.out.println("Enter the String to count the frequency of the charcters: ");
        String line = sc.nextLine();
        String line1 = line.replaceAll("[^a-zA-Z]", "");
        char[] linearray = line.toCharArray();

        for(char c: linearray){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println(map);
    }
}
