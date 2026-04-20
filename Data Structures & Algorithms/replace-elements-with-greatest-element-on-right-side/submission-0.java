class Solution {
    public int[] replaceElements(int[] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int maxVal = -1;
            for (int j = i + 1; j < arr.length; j++) {
                maxVal = Math.max(arr[j], maxVal);
            }
            ans[i] = maxVal;
        }
        return ans;
    }
}