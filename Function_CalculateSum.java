import java.util.Scanner;

public class Function_CalculateSum {

    public static int calculateSum(int num1 , int num2){
        int Sum = num1 + num2;

        return Sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number:");
        int num2 = sc.nextInt();

        int Sum = calculateSum(num1, num2);

        System.out.println("Sum of 2 Num :"+Sum);
    }
}


