package Week_02;

import java.util.*;

class HomeWork4 {
    public List<List<String>> groupAnagrams(String[] strs) {

        if (null == strs)
            return null;

        Map<String, List<String>> map = new HashMap<>();

        for (String str:strs) {
            char[] s = str.toCharArray();
            Arrays.sort(s);
            String key = String.valueOf(s);
            if (!map.containsKey(key))
                map.put(key, new ArrayList());
            map.get(key).add(str);
        }

        return new ArrayList(map.values());
    }
}
