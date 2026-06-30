class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> set = new HashSet<>();         
 
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                for(int k=j+1;k<nums.length;k++) {
                    if(nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> list =  Arrays.asList(nums[i], nums[j], nums[k]);
                    Collections.sort(list);
                    set.add(list);
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }
}
