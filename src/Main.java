//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n = 17  ;
        int c = 2;

        while(c*c <= n) {
            if (n%c == 0) {
                System.out.println("not prime");
            }
            c++;
        }
        System.out.println("prime");
    }
}