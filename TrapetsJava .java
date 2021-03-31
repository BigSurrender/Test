import java.util.Scanner;

public class TrapetsJava{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("a: ");
        float a = scan.nextFloat();
        System.out.println("b: ");
        float b = scan.nextFloat();
        System.out.println("h: ");
        float h = scan.nextFloat();

        if (a <= 0 || b <= 0 || h <= 0) {
            System.out.println("Side can't be 0 or less!");
        }else {
            float S = (a + b) / 2 * h;
            System.out.println("S = " + S);
        }
    }
}
