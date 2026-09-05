class Solution {
    public int firstStableIndex(int[] nums, int k) {
        // brute force approach?
        int maxi = nums[0];
        int mini = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maxi){
                maxi = nums[i];
            }
            mini = nums [i];
            
            for(int j=i;j<nums.length;j++){
                if(mini>nums[j]){
                    mini=nums[j];
                }
            }
            if((maxi-mini)<=k){
                ans = Math.min(ans,i);
            }
            
        }if(ans == Integer.MAX_VALUE){ans = -1;}
        return ans;


    }
}