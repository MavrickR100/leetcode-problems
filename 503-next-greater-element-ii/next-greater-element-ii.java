class Solution {
    public int[] nextGreaterElements(int[] nums) {

        Stack<Integer> stack = new Stack<>();
        int i,j=0,size=nums.length*2;
        int[] nums2 = new int[size*2];
        int[] ans = new int[size/2];

        for(i=0;i<size;i++){
            nums2[i]=nums[i%nums.length];
        }
        
        for(i=size-1;i>0;i--){
            while(stack.size() > 0 && nums2[stack.peek()] <= nums2[i]){
                stack.pop();
            }

            if(stack.size() == 0){
                ans[i%(size/2)] = -1;
            }else{
                ans[i%(size/2)] = nums2[stack.peek()];
            }
            stack.push(i%(size/2));
        }
        return ans;
    }
}