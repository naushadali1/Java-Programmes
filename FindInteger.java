public class FindInteger {
    public static void main(String[] args) {
        int[] arr = { 23, 65, 46, 42, 4, 3, 34, 56 };
        int num = 4;
        boolean isAnArray = false; // fisrt we consider the number is not present in the array
        for (int element : arr) {
            if (element == num) {
                isAnArray = true;
                break; // when find the number than no need to search more on the array
            }
        }
        if (isAnArray) {
            System.out.printf("the %d is present in the array", num);
        } else {
            System.out.println("the number is not present in the array");

        }
    }
}
