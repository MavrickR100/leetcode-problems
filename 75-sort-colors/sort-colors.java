class Solution {
    public void sortColors(int[] nums) {
        int size = nums.length;
        if(size<2){
            return;
        }
        int start=0,mid=0,end=size-1;
        while(mid <= end ){
            if(nums[mid]==0){
                    nums[start]=nums[start]+nums[mid];
                    nums[mid]=nums[start]-nums[mid];
                    nums[start]=nums[start]-nums[mid];
                    start++;
                    mid++;
            }else if(nums[mid]==2){
                int a=nums[mid],b=nums[end];
                  a= a+b;
                  b=a-b;
                  a=a-b;
                  nums[mid]=a;
                  nums[end]=b;
                    end--;
            }else if(nums[mid]==1){
                mid++;
            }
        }
    }
}