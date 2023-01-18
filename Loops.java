import java.util.Scanner;

// print the Ssum of first n Natural number

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i= 0 ;i<=n;i++ ){
         sum = sum +i;
        }
        System.out.println(sum);
    }
}

