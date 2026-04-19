// import java.util.Map;
// import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> firstMap = new HashMap<>();
        Map<Character, Integer> secondMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (firstMap.containsKey(s.charAt(i))) {
                firstMap.put(s.charAt(i), firstMap.get(s.charAt(i)) + 1);
            } else {
                firstMap.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (secondMap.containsKey(t.charAt(i))) {
                secondMap.put(t.charAt(i), secondMap.get(t.charAt(i)) + 1);
            } else {
                secondMap.put(t.charAt(i), 1);
            }
        }
        return firstMap.equals(secondMap);
    }
}
