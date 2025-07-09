import java.util.*;

public class Chocola {
    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer cutHor[] = { 4, 1, 2 };
        Integer cutVer[] = { 2, 1, 3, 1, 4 };
        Arrays.sort(cutVer, Collections.reverseOrder());
        Arrays.sort(cutHor, Collections.reverseOrder());
        int h = 0, v = 0, hp = 1, vp = 1, cost = 0;

        while (h < n - 1 && v < m - 1) {
            if (cutHor[h] >= cutVer[v]) {
                cost += (cutHor[h++] * vp);
                hp++;
            } else {
                cost += (cutVer[v++] * hp);
                vp++;
            }
        }
        while (h < n - 1) {
            cost += (cutHor[h++] * vp);
            hp++;
        }
        while (v < m - 1) {
            cost += (cutVer[v++] * hp);
            vp++;
        }
        System.out.println(cost);
    }
}
