public class SumByMethod {
    static int sum(int x, int y) {
        int sumof = x + y;
        return sumof;
    }

    public static void main(String[] args) {
        int a = 2, b = 4;
        int s = sum(a, b);
        System.out.printf("the sum of %d and %d is %d", a, b, s);
    }
}
