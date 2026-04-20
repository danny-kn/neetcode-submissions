// class Solution {
//     public int[] replaceElements(int[] arr) {
//         int[] ans = new int[arr.length];
//         for (int i = 0; i < arr.length; i++) {
//             int maxVal = -1;
//             for (int j = i + 1; j < arr.length; j++) {
//                 maxVal = Math.max(arr[j], maxVal);
//             }
//             ans[i] = maxVal;
//         }
//         return ans;
//     }
// }

// class Solution {
//     public int[] replaceElements(int[] arr) {
//         int[] ans = new int[arr.length];
//         int i = 0;
//         while (i < arr.length) {
//             int maxVal = -1;
//             int j = i + 1;
//             while (j < arr.length) {
//                 maxVal = Math.max(arr[j], maxVal);
//                 j++;
//             }
//             ans[i] = maxVal;
//             i++;
//         }
//         return ans;
//     }
// }

// class Solution {
//     public int[] replaceElements(int[] arr) {
//         int n = arr.length;
//         int[] ans = new int[n];
//         int i = 0;
//         while (i < n) {
//             int maxVal = -1;
//             int j = i + 1;
//             while (j < n) {
//                 maxVal = Math.max(arr[j], maxVal);
//                 j++;
//             }
//             ans[i] = maxVal;
//             i++;
//         }
//         return ans;
//     }
// }

// class Solution {
//     public int[] replaceElements(int[] arr) {
//         int n = arr.length;
//         int[] ans = new int[n];
//         for (int i = 0; i < n; i++) {
//             int maxVal = -1;
//             for (int j = i + 1; j < n; j++) {
//                 maxVal = Math.max(arr[j], maxVal);
//             }
//             ans[i] = maxVal;
//         }
//         return ans;
//     }
// }

// class Solution {
//     public int[] replaceElements(int[] arr) {
//         int[] ans = new int[arr.length];
//         int maxVal = -1;
//         for (int i = arr.length - 1; i >= 0; i--) {
//             ans[i] = maxVal;
//             maxVal = Math.max(arr[i], maxVal);
//         }
//         return ans;
//     }
// }

class Solution {
    public int[] replaceElements(int[] arr) {
        int[] ans = new int[arr.length];
        int maxVal = -1;
        int i = arr.length - 1;
        while (i >= 0) {
            ans[i] = maxVal;
            maxVal = Math.max(arr[i], maxVal);
            i--;
        }
        return ans;
    }
}

// class Solution {
//     public int[] replaceElements(int[] arr) {
//         int n = arr.length;
//         int[] ans = new int[n];
//         int maxVal = -1;
//         for (int i = n - 1; i >= 0; i--) {
//             ans[i] = maxVal;
//             maxVal = Math.max(arr[i], maxVal);
//         }
//         return ans;
//     }
// }