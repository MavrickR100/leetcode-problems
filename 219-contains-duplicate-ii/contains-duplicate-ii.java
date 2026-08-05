class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();
        int i,j;

        for(i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                j = map.get(nums[i]);
                j = Math.abs(j-i);

                if(j<=k){
                    return true;
                }
            }
            
            map.put(nums[i],i);
        }

        return false;
        
    }
}