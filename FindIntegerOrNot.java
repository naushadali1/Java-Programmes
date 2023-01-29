import java.util.Scanner;

public class FindIntegerOrNot {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number : ");
      try {
        int number = Integer.parseInt(sc.nextLine());
        System.out.println(number + " is An Integer");
      } catch (NumberFormatException e) {
        System.out.println(e + " is not an Integer");
      }
       sc.close();
    }
        }