import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class WordCounter {

    public static String nextWordOrSeparator(String s, int pos, String separators) {
        boolean isSeparator = separators.indexOf(s.charAt(pos)) != -1;
        int endPos = pos + 1;

        if (isSeparator) {
            while (endPos < s.length() && separators.indexOf(s.charAt(endPos)) != -1) {
                endPos++;
            }
        } else {
            while (endPos < s.length() && separators.indexOf(s.charAt(endPos)) == -1) {
                endPos++;
            }
        }

        String token;
        if (endPos < s.length()) {
            token = s.substring(pos, endPos);
        } else {
            token = s.substring(pos);
        }

        return token;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final String SEPARATORS = " ,.?!;:(){}[]\t\n\"";

        System.out.print("Enter string: ");
        String s = in.nextLine();

        int pos = 0;
        List<String> words = new ArrayList<>();

        while (pos < s.length()) {
            String token = nextWordOrSeparator(s, pos, SEPARATORS);
            if (SEPARATORS.indexOf(token.charAt(0)) == -1) {
                words.add(token);
            }
            pos += token.length();
        }

        System.out.print("Words:");
        for (String x : words) {
            System.out.print(" " + x);
        }
        System.out.println();
        System.out.println("Total number of words: " + words.size());
    }
}
