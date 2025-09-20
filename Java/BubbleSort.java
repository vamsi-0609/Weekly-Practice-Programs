package Day2;
import java.util.*;
public class BubbleSort {
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

        System.out.println("Array before sorting: ");
        for(int n: array){
            System.out.print(n + " ");
        }

        //Bubble sorting Logic
        for(int i = 0;i < array.length - 1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Array after applying bubble  sort: ");
        for(int n: array){
            System.out.print(n + " ");
        }


    }
}
