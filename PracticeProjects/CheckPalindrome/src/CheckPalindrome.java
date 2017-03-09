import java.util.Scanner;

public class CheckPalindrome {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = in.nextLine();

        boolean isPal = true;
        int front = 0, back = s.length() - 1;
        while (isPal && front < back) {
            if (s.charAt(front) != s.charAt(back)) {
                isPal = false;
            }
            front++;
            back--;
        }

        System.out.println("isPal = " + isPal);
    }
}
