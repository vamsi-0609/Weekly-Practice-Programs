import java.util.*;
public class Calculator {
    public static int calculation(int num1, int num2, char op){
        int result = 0;
        if (op == '+')
            result = num1 + num2;
        else if(op == '-')
            result = num1 - num2;
        else if(op == '*')
            result = num1 * num2;
        else if(op == '/' && num2 != 0)
            result = num1 / num2;
        else
            System.out.println("invalid operator");
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number 2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the operator: (+, -, *, /) ");
        char op = sc.next().charAt(0);
        int result = calculation(num1, num2, op);
        System.out.println("The final result is: " + result);

    }
}
