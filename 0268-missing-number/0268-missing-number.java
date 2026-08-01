class Solution {
    public int missingNumber(int[] nums) {

        int totalSum = 0;
        for(int num:nums){
            totalSum += num;
        }

        int n = nums.length;
        int formulaSum = n*(n+1)/2 ;
        
        return formulaSum - totalSum;
    }
}