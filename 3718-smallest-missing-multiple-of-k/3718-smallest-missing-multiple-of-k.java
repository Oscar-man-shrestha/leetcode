class Solution {
    public int missingMultiple(int[] nums, int k) {
    Set<Integer> s = new HashSet<>();
    for(int i =0; i<nums.length ;i++){
        s.add(nums[i]);
    }
    for(int j=1;j<nums.length+2;j++){
         System.out.print(j);
        if(!s.contains(k*j)){
           
            return k*j;
        }
    }
    return -1;
    }
}