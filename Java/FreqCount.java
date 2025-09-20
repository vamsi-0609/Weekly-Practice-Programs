package Day2;
import java.util.*;

public class FreqCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println("Enter the space separated characters below: ");
        String line = sc.nextLine();
        String[] parts = line.split(" ");

        for (String p : parts) {
            int num = Integer.parseInt(p);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() +" -> "+ entry.getValue());
        }

    }
}
