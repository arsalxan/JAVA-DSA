import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    static void generatePrintBinary(int n) {
        Queue<String> q = new LinkedList<String>();
        q.add("1");
        while (n-- > 0) {
            String s1 = q.remove();
            System.out.println(s1);
            q.add(s1 + "0");
            q.add(s1 + "1");
        }
    }

    public static void main(String[] args) {
        int n = 3;
        generatePrintBinary(n);
    }
}