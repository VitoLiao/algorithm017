package Week_02;

class Solution {
    public static int lengthOfLongestSubstring(String s) {

        if (null == s)
            return 0;

        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            int tmp = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) != s.charAt(j))
                    tmp++;
                else
                    break;
            }
            maxLength = Math.max(maxLength, tmp);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
