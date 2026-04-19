// import java.util.Set;
// import java.util.HashSet;

// class Solution {
//     public boolean hasDuplicate(int[] nums) {
//         Set<Integer> set = new HashSet<>();
//         for (int i = 0; i < nums.length; i++) {
//             set.add(nums[i]);
//         }
//         return set.size() != nums.length;
//     }
// }

class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return set.size() != nums.length;
    }
}