import java.util.LinkedList;
import java.util.Queue;

public class FNRC {
    public static void frc(String str) {
        Queue<Character> q = new LinkedList<>();
        int[] freqOfLetter = new int[26];
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freqOfLetter[ch - 'a']++;

            // Remove characters from the front that have frequency > 1
            while (!q.isEmpty() && freqOfLetter[q.peek() - 'a'] > 1) {
                q.remove();
            }
        }

        if (q.isEmpty()) {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("The first non-repeating character is: " + q.peek());
        }
    }

    public static void main(String[] args) {
        frc("aabbsse"); // Expected output: e
    }
}
