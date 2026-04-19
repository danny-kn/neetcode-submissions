// import java.util.Map;
// import java.util.HashMap;

// class Solution {
//     public boolean isAnagram(String s, String t) {
//         Map<Character, Integer> firstMap = new HashMap<>();
//         Map<Character, Integer> secondMap = new HashMap<>();
//         for (int i = 0; i < s.length(); i++) {
//             if (firstMap.containsKey(s.charAt(i))) {
//                 firstMap.put(s.charAt(i), firstMap.get(s.charAt(i)) + 1);
//             } else {
//                 firstMap.put(s.charAt(i), 1);
//             }
//         }
//         for (int i = 0; i < t.length(); i++) {
//             if (secondMap.containsKey(t.charAt(i))) {
//                 secondMap.put(t.charAt(i), secondMap.get(t.charAt(i)) + 1);
//             } else {
//                 secondMap.put(t.charAt(i), 1);
//             }
//         }
//         return firstMap.equals(secondMap);
//     }
// }

// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if (s.length() != t.length()) { return false; }
//         Map<Character, Integer> firstMap = populateMap(s);
//         Map<Character, Integer> secondMap = populateMap(t);
//         return firstMap.equals(secondMap);
//     }

//     public Map<Character, Integer> populateMap(String str) {
//         Map<Character, Integer> map = new HashMap<>();
//         for (int i = 0; i < str.length(); i++) {
//             if (map.containsKey(str.charAt(i))) {
//                 map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
//             } else {
//                 map.put(str.charAt(i), 1);
//             }
//         }
//         return map;
//     }
// }

// class Solution {
//     public boolean isAnagram(String s, String t) {
//         char[] sArr = s.toCharArray();
//         char[] tArr = t.toCharArray();
//         Arrays.sort(sArr);
//         Arrays.sort(tArr);
//         return Arrays.equals(sArr, tArr);
//     }
// }

// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if (s.length() != t.length()) { return false; }
//         char[] sArr = s.toCharArray();
//         char[] tArr = t.toCharArray();
//         Arrays.sort(sArr);
//         Arrays.sort(tArr);
//         return Arrays.equals(sArr, tArr);
//     }
// }

class Solution {
    public boolean isAnagram(String s, String t) {
        List<Character> firstList = new ArrayList<>();
        List<Character> secondList = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            firstList.add(ch);
        }
        for (char ch : t.toCharArray()) {
            secondList.add(ch);
        }
        Collections.sort(firstList);
        Collections.sort(secondList);
        return firstList.equals(secondList);
    }
}