class Solution {
    public int smallestIndex(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            int CurrSum = 0;
            while(n>0){
              int back = n%10;
               CurrSum += back;
               n=n/10;
            }
           
            if(CurrSum==i){
                return i;
            }
            


        }
        return -1;
    }
}