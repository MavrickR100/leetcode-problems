class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[nums2.length];
        int[] ret = new int[nums1.length];
        int k=nums2.length-1;
        Map<Integer,Integer> map = new HashMap<>();

            for(int j=nums2.length-1;j>=0;j--){
                    while(stack.size() > 0 && stack.peek() <= nums2[j]){
                        stack.pop();
                    }   
                if(stack.size()==0){
                    ans[k--] = -1;
                }else{
                    ans[k--]=stack.peek();
                }
                stack.push(nums2[j]);
            }

        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i],ans[i]);
        }

        for(int i=0;i<nums1.length;i++){
            ret[i]=map.get(nums1[i]);
        }
        return ret;
    }
}