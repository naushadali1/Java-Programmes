public class Pattren {
    public static void main(String[] args) {
        int n = 5;
        for (int index = n; index > 0; index--) {
            for (int j = 0; j < index; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
