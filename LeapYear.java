import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the year to be checked");
        int yr= s.nextInt();

        if((yr%4==0 && yr%100!=0)|| yr%400==0)
            System.out.println("Leap year");
        else
            System.out.println("Not a leap year");
    
    }
}
