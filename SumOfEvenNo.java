public class SumOfEvenNo {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        for (int index = 0; index < n; index++) {
            sum = sum + (2 * index);
        }
        System.out.println("The sum of first 5 number is :" + sum);
    }
}
