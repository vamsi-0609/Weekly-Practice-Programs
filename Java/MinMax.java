public class MinMax {
    public static void main(String[] args) {
        int[] array = {23, 54, 67, 43, 12, 65, 89};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num: array){
            if (num < min){
                min = num;
            }
            if (num > max){
                max = num;
            }
        }

        System.out.println("The Max element from the list is: " + max +
                "\n" +
                "The Min element from the list is: "+ min);

    }
}
