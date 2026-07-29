class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        
        for(int i=0; i<nums.length;i++){
            if(countDigit(nums[i])){
                count++;
            }
        }
        return count;
    }
    private boolean countDigit(int num){
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        return count%2==0;
    }
}