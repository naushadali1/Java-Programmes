import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        byte sub1 ,sub2 ,sub3 ;
        float avg ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Math marks");
        sub1 = sc.nextByte();
        System.out.println("Enter Phys marks");
        sub2 = sc.nextByte();
        System.out.println("Enter Java marks");
        sub3 = sc.nextByte();
        avg = (sub1 + sub2 + sub3) /3.0f ;

        if (avg>= 40 && sub1>=33 && sub2>= 33 && sub3>=33) {
            System.out.println("Congratulation You are Passed");
        } else {
            System.out.println("Try Next time");
        }

    }
}
