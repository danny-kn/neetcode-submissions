// import java.util.List;
// import java.util.ArrayList;

// import java.util.Stack;

class Solution {
    public void reverseString(char[] s) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            list.add(s[i]);
        }
        Collections.reverse(list);
        for (int i = 0; i < s.length; i++) {
            s[i] = list.get(i);
        }
    }
}

// class Solution {
//     public void reverseString(char[] s) {
//         Stack<Character> stack = new Stack<>();
//         for (int i = 0; i < s.length; i++) {
//             stack.push(s[i]);
//         }
//         for (int i = 0; i < s.length; i++) {
//             s[i] = stack.pop();
//         }
//     }
// }

// class Solution {
//     public void reverseString(char[] s) {
//         Stack<Character> stack = new Stack<>();
//         for (char ch : s) {
//             stack.push(ch);
//         }
//         for (int i = 0; i < s.length; i++) {
//             s[i] = stack.pop();
//         }
//     }
// }