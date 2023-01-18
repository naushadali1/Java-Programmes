import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("num1 is greater than Number 2");
        } else if (num1 < num2) {
            System.out.println("Number1 is less than number2");
        } else {
            System.out.println("Equal");
        }

    }
}
