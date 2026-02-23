class Solution {

    public int getDigitSum(int[] nums){
        int i,sum=0,tem;
        for(i=0;i<nums.length;i++){
            tem = nums[i];
            while(tem !=0){
                sum += tem %10;
                tem/=10;
            }
        }
        return sum;
    }

    public int differenceOfSum(int[] nums) {
        int y = 0,x = getDigitSum(nums);
        for(int i=0;i<nums.length;i++){
            y += nums[i];
        }
        return Math.abs(x-y);
    }
}