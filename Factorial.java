public class Factorial {
    public static void main(String[] args) {
        int fact = 1;
        int number = 5;
        for (int index = 1; index <= number; index++) {
            fact = fact * index;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}
