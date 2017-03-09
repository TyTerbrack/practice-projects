import java.util.Scanner;

public class CountVowels1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final String VOWELS = "aeiouAEIOU";

        System.out.print("Enter string: ");
        String s = in.nextLine();

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (VOWELS.indexOf(s.charAt(i)) != -1) {
                sum++;
            }
        }

        System.out.println("The string contains " + sum + " vowels.");
    }
}
