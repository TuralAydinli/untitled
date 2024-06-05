import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a1 = sc.nextDouble();
        double a2 = sc.nextDouble();
        double a3 = sc.nextDouble();
        double a4 = sc.nextDouble();
        System.out.println((a1 * a2 - a2 *a2) /(a3-a4));
    }
}
