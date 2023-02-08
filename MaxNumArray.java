public class MaxNumArray {
    public static void main(String[] args) {
        int[] arr = { 34, 356, 77, 8, 399, 7, 556, 5, 34, 4, 3 };
        int max = Integer.MIN_VALUE;
        for (int element : arr) {
            if (element > max) {
                max = element;
            }

        }
        System.out.println("the maximum number is " + max);
    }
}
