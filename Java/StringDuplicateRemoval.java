package Day3;
import java.util.*;

public class StringDuplicateRemoval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Character> set = new HashSet<>();
        char[] line = sc.nextLine().toCharArray();
        for(char c: line){
            if(!set.contains(c)){
                set.add(c);
                System.out.print(c);
            }
        }
        System.out.println(set);



    }
}
