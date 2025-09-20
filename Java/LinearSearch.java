package Day2;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the space separated elements: ");
        String line = sc.nextLine();
        String[] parts = line.split(" ");
        int[] array = new int[parts.length];

        int k = 0;
        for(String num: parts){
            array[k] = Integer.parseInt(num);
            k++;
        }

        System.out.print("Enter the number to find in the list or not: ");
        int num = sc.nextInt();

        boolean flag = true;
        for (int i = 0; i < array.length; i++){
            if (array[i] == num){
                System.out.println("The element "+ array[i] +" is found at index "+ i);
                flag = false;
                break;
            }
        }

        if(flag){
            System.out.println("The element is not found in the given array");
        }

    }
}
