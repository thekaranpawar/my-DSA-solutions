class Solution {
    public int maxProduct(int[] nums) {
        
        int maxPro = nums[0];
        for(int i=0; i<nums.length; ++i){
            int pro=1;
            for(int j=i; j<nums.length; ++j){

                pro *= nums[j];
                if(pro>maxPro){
                    maxPro = pro;
                }
            }
        }
        return maxPro;
    }
}