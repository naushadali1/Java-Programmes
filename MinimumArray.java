public class MinimumArray {
    public static void main(String[] args) {
        int[] a = { 45, 56, 7, 8, 5, 32, 2, 322, 4, 12, -4 };
        int min = Integer.MAX_VALUE;
        for (int ee : a) {
            if (ee < min) {
                min = ee;
            }
        }
        System.out.println("The minimum value is " + min);
    }
}
