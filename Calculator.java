import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second  Number");
        int num2 = sc.nextInt();
        System.out.println("Enter 1 for +");
        System.out.println("Enter 2 for -");
        System.out.println("Enter 3 for *");
        System.out.println("Enter 4 for /");
        int oprator=sc.nextInt();
       switch (oprator) {
        case 1:
           System.out.println( num1 + num2);
            break;
        case 2 :
        System.out.println(num1 -num2); 
        break;
        case 3 : 
       System.out.println(num1 * num2);
       break;
        case 4 : 
       System.out.println((num1 / num2));
       break;
        default:
    System.out.println("Invalid Operator");
            break;
       }

    }
}
