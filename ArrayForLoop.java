public class ArrayForLoop {
    public static void main(String[] args) {
        int[] marks = { 12, 45, 75, 34, 78, 543, 2, 3, 4, 5, 6, 32, 2 };
        for (int index = 0; index < marks.length; index++) // Display an array using for loop
        {
            System.out.println(marks[index]);
        }

        System.out.println("elements in reverse order :");

        for (int i = marks.length - 1; i >= 0; i--) // Display elements in reverse order
        {
            System.out.println(marks[i]);
        }

        System.out.println("The lenth od an array is " + marks.length);
    }
}
