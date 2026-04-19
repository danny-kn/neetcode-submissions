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

// class Solution {
//     public boolean hasDuplicate(int[] nums) {
//         Set<Integer> set = new HashSet<>();
//         for (int i = 0; i < nums.length; i++) {
//             if (set.contains(nums[i])) {
//                 return true;
//             }
//             set.add(nums[i]);
//         }
//         return false;
//     }
// }

// class Solution {
//     public boolean hasDuplicate(int[] nums) {
//         boolean containsDuplicate = false;
//         Set<Integer> set = new HashSet<>();
//         for (int i = 0; i < nums.length; i++) {
//             if (set.contains(nums[i])) {
//                 containsDuplicate = true;
//                 return containsDuplicate;
//             }
//             set.add(nums[i]);
//         }
//         return containsDuplicate;
//     }
// }

// class Solution {
//     public boolean hasDuplicate(int[] nums) {
//         Set<Integer> set = new HashSet<>();
//         for (int num : nums) {
//             set.add(num);
//         }
//         return set.size() != nums.length;
//     }
// }

// class Solution {
//     public boolean hasDuplicate(int[] nums) {
//         Set<Integer> set = new HashSet<>();
//         for (int num : nums) {
//             if (set.contains(num)) {
//                 return true;
//             }
//             set.add(num);
//         }
//         return false;
//     }
// }

class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean containsDuplicate = false;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                containsDuplicate = true;
                return containsDuplicate;
            }
            set.add(num);
        }
        return containsDuplicate;
    }
}

// class Solution {
//     public boolean hasDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] == nums[i - 1]) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }

// class Solution {
//     public boolean hasDuplicate(int[] nums) {
//         boolean containsDuplicate = false;
//         Arrays.sort(nums);
//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] == nums[i - 1]) {
//                 containsDuplicate = true;
//                 return containsDuplicate;
//             }
//         }
//         return containsDuplicate;
//     }
// }