import java.util.Scanner;

public class CalculatePercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter marks subject 1 out of 100");
    int sub1 = sc.nextInt();
    System.out.println("Enter marks subject 2 out of 100");
    int sub2 = sc.nextInt();
    System.out.println("Enter marks subject 3 out of 100");
    int sub3 = sc.nextInt();
    System.out.println("Enter marks subject 4 out of 100");
    int sub4 = sc.nextInt();
    System.out.println("Enter marks subject 5 out of 100");
    int sub5 = sc.nextInt();
    int obtained = sub1+sub2+sub3+sub4+sub5;
    int total = 500;
    float percentage = (obtained * 100) / total;
    System.out.println("Your Percentage is " + percentage+"%");
    }
}
