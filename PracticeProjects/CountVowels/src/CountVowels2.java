import java.util.Scanner;

public class CountVowels2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = in.nextLine();

        int[] sums = new int[5];
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'a':
                case 'A':
                    sums[0]++;
                    break;
                case 'e':
                case 'E':
                    sums[1]++;
                    break;
                case 'i':
                case 'I':
                    sums[2]++;
                    break;
                case 'o':
                case 'O':
                    sums[3]++;
                    break;
                case 'u':
                case 'U':
                    sums[4]++;
                    break;
                default:
                    break;
            }
        }

        System.out.println("The string contains " + sums[0] + " A('s), "
                + sums[1] + " E('s), " + sums[2] + " I('s), " + sums[3]
                + " O('s), and " + sums[4] + " U('s).");

    }
}
