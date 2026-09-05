class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int suffix [] = new int[nums.length];
        int mini = Integer.MAX_VALUE;
        int idx = Integer.MAX_VALUE;
        int max = nums[0];
        for(int i=nums.length-1 ;i>=0;i--){
            suffix[i]=Math.min(nums[i],mini);
            if(mini>suffix[i]){
                mini = suffix[i];
            }
           
        }
        max = nums[0];
        for(int i = 0;i<nums.length;i++){
            if(max<nums[i]){
                max = nums[i];
            }
            
            if((max - suffix[i])<=k){
                idx =  Math.min(i,idx);
                
            }
        }
        if(idx==Integer.MAX_VALUE) {
            return -1;
        }
        return idx;
    }
}