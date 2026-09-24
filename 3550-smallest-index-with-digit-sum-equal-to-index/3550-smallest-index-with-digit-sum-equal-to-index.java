class Solution {
    public int smallestIndex(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int CurrSum = 0;
            while(nums[i]>0 ){
              int back = nums[i]%10;
               CurrSum += back;
               nums[i]=nums[i]/10;
            }
           
            if(CurrSum==i){
                return i;
            }
        }
        return -1;
    }
}