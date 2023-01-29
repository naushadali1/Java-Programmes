public class IncreamentDecreament {
    public static void main(String[] args) {
        int a = 50 ;
        System.out.println(a); // use a => 50
        System.out.println(++a); // first increament and then use (print) a => 51
        System.out.println(a);   // use a => 51
        System.out.println(a++); // first use (print) a and then increament a =>51
        System.out.println(a); // use (print) a =>52
      int n = 2;
      System.out.println(++n * 10); // ( n=(2+1)*10) => ++ precedence grester than *
    }
}
