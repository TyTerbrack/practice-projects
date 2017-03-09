import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a positive int: ");
        int n = in.nextInt();

        int f = 0, x = 0, y = 1;
        System.out.print("Fibonacci: " + x + " " + y);

        while (f < n) {
            f = x + y;
            x = y;
            y = f;
            System.out.print(" " + f);
        }
    }
}
