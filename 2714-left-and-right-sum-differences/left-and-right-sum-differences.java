class Solution {
    public int[] leftRightDifference(int[] nums) {
        int i,j,sum=0,n=nums.length,tem=0;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        for(i=0;i<n;i++){
            sum+=nums[i];
        }
        tem=sum;

        for(i=n-1;i>=0;i--){
            tem = tem-nums[i];
            leftSum[i] = tem;
            
        }
        tem = sum;
        for(i=0;i<n;i++){
           tem = tem - nums[i];
           rightSum[i]=tem;
        }

        for(i=0;i<n;i++){
           nums[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return nums;
    }
}