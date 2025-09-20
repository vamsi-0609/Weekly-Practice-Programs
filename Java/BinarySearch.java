package Day2;
import java.util.*;
public class BinarySearch {
    public static int Search(int[] array, int target){
        int left = 0;
        int right = array.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;

            if(array[mid] == target)
                return mid;
            else if (array[mid] < target)
                left = mid + 1;
            else if (array[mid] > target)
                right = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int target = 78;
        int index = Search(array, target);

        if (index == -1)
            System.out.println("The target element "+ target+" is not found in the array");
        else
            System.out.println("The target element "+ target +" is found at index: "+ index);

    }
}
