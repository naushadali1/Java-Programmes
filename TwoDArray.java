public class TwoDArray {
    public static void main(String[] args) {
        int[][] flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        for (int index = 0; index < flats.length; index++) {
            for (int j = 0; j < flats[index].length; j++) {
                System.out.print(flats[index][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

    }
}
