class Solution {
    public int longestConsecutive(int[] nums) {        
      List<Integer> list = new ArrayList<>();
      int maxLength = 0;

      for(int i=0;i<nums.length;i++){
        int currentNum = nums[i];
        List<Integer> currentList = new ArrayList<>();
        currentList.add(currentNum);  
        boolean found = true;

        while(found) {
            found = false;
            for(int j=0;j<nums.length;j++) {
                if(nums[j] == currentNum +1) {
                    found = true;
                    currentNum++;
                    currentList.add(currentNum);
                    break;   
                }
            }
             if(currentList.size() > maxLength) {
                maxLength = currentList.size();
                list = new ArrayList<>(currentList);
             }
        }
       
      }
      return list.size();
    
    }
}
