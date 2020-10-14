package Week_02;

//242. 有效的字母异位词
public class HomeWork1 {

    //使用hash表的思想，数组下标表示小写字母，值表示出现的次数，时间复杂度为O(nlogn)
    public boolean isAnagram(String s, String t) {

        if (null == s || null == t || s.length() != t.length())
            return false;

        int[] ans = new int[26];

        for (int i = 0; i < s.length(); i++) {
            ans[s.charAt(i) - 'a']++;
            ans[t.charAt(i) - 'a']--;
        }

        for (int x : ans){
            if (x != 0)
                return false;
        }

        return true;

    }

    // //直接排序的解法，时间复杂度为O(nlogn)
    // public boolean isAnagram(String s, String t) {

    //     if (null == s || null == t || s.length() != t.length())
    //         return false;

    //     char[] a = s.toCharArray();
    //     char[] b = t.toCharArray();

    //     Arrays.sort(a);
    //     Arrays.sort(b);

    //     return Arrays.equals(a, b);
    // }
}
