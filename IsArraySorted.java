public class IsArraySorted {
    public static void main(String[] args) {
        int[] a = { 45, 56, 73, 83, 90, 132, 222, 322, 433, 512, };
        boolean isSorted = true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
