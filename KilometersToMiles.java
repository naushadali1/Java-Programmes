import java.util.Scanner;

public class KilometersToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kilometres to Miles Converter");
        System.out.print("Input Kilometres");
        float kilometers = sc.nextFloat();
        float miles = kilometers * 0.621371f;
        System.out.println(miles  + " Miles");
    }
}
