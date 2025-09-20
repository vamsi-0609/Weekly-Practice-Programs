import java.io.*;

import java.util.*;
public class GroceryList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] Grocery = {"Milk", "Bread", "Jam", "Butter", "Cake"};
        for(String item: Grocery){
            System.out.printf("%-10s", item);
        }

        String[] Groceries = new String[Grocery.length+1];
        System.arraycopy(Grocery, 0, Groceries, 0, Grocery.length); // New Way of copying array
        Groceries[Grocery.length] = sc.next();

        for (String item: Groceries){
            System.out.printf("%-10s", item);
        }

        String[] Groceries2 = new String[Groceries.length-1];
        sc.nextLine();
        String item = sc.nextLine();
        int j = 0;
        for(int i = 0; i < Groceries.length; i++){
            if (!item.equals(Groceries[i])){
                Groceries2[j++] = Groceries[i];
            }
        }

        for (String it: Groceries2){
            System.out.printf("%-10s", it);
        }

    }
}
