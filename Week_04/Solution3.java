package Week_04;

import java.util.Arrays;

//455. 分发饼干
class Solution3 {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int len = g.length;
        int n = 0;
        for (int k: s) {
            if (n == len)
                return n;

            if (k >= g[n])
                n++;
        }

        return n;

    }
}
