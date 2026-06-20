class Solution {
    public boolean hasDuplicate(int[] nums) {
        //Using Hash Set
        // HashSet<Integer> set = new HashSet<Integer>();

        // for(int num : nums) {
        //     set.add(num);
        // }

        // return set.size() != nums.length;
         
         Arrays.sort(nums);

         for(int i=0;i<nums.length;i++){
            if(i < nums.length-1 && nums[i]==nums[i+1]) {
                return true;
            }
         }

         return false;
        
    }
}