class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){ // 0 1 2 3 
            int c = map.getOrDefault(nums[i],-1);
            System.out.print(c+" ");
            if(c == -1){
                map.put(nums[i],1);
            }else if(c ==1){
                return true;
            }
        }
        return false;
    }
}