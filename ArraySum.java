public class ArraySum {
    public static void main(String[] args) {
        float[] marks = { 23.3f, 56.6f, 84.7f, 87.0f };
        float sum = 0;
        for (float element : marks) {
            sum = sum + element;
        }
        System.out.println("sum of floats numbers are : " + sum);
    }
}
