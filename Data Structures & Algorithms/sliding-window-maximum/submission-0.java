class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // int max = 0;
        // int n = nums.length;
        // int[] result = {}; 
        // int left = 0;
        // int right = k;

        // while(right < n) {
        //       for(int i = left ; i < right; i++) {
        //          if(nums[i] > max){
        //             max = nums[i];
        //             result[i] = (max);
        //          }                 
        //       }

        //       right++;
        //       left++;
        // }
        int n = nums.length;
        int[] result = new int[n - k + 1];

        int index = 0;

for (int left = 0; left <= n - k; left++) {

    int max = nums[left];

    for (int i = left; i < left + k; i++) {
        max = Math.max(max, nums[i]);
    }

    result[index++] = max;
}

        return result;
    }
}
