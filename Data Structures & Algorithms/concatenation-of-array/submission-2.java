// class Solution {
//     public int[] getConcatenation(int[] nums) {
//         int[] ans = new int[2 * nums.length];
//         for (int i = 0; i < nums.length; i++) {
//             ans[i] = nums[i];
//             ans[i + nums.length] = nums[i];
//         }
//         return ans;
//     }
// }

// class Solution {
//     public int[] getConcatenation(int[] nums) {
//         int n = nums.length;
//         int[] ans = new int[2 * n];
//         for (int i = 0; i < n; i++) {
//             ans[i] = nums[i];
//             ans[i + n] = nums[i];
//         }
//         return ans;
//     }
// }

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        int i = 0;
        while (i < nums.length) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
            i++;
        }
        return ans;
    }
}