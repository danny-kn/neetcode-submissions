// class Solution {
//     public int search(int[] nums, int target) {
//         int a = 0;
//         int b = nums.length - 1;
//         while (a <= b) {
//             int m = a + ((b - a) / 2);
//             if (nums[m] < target) {
//                 a = m + 1;
//             } else if (nums[m] > target) {
//                 b = m - 1;
//             } else {
//                 return m;
//             }
//         }
//         return -1;
//     }
// }

class Solution {
    public int search(int[] nums, int target) {
        int idx = Arrays.binarySearch(nums, target);
        if (idx < 0) { return -1; }
        return idx;
    }
}