class Solution {
    public int[] getSneakyNumbers(int[] nums) {

    int i,j;

    Map<Integer,Integer> map = new HashMap<>();

    for(i=0;i<nums.length;i++){
        if(map.containsKey(nums[i]) == true){
            int val = map.get(nums[i]);
            map.put(nums[i],++val);
        }else{
            map.put(nums[i],1);
        }
    }
List<Integer> ans = new ArrayList<>();

   for(Map.Entry<Integer,Integer> entry : map.entrySet() ){
    int key = entry.getKey();
    int val = entry.getValue();
    if(val >1){
        ans.add(key);
    }
   }

 int[] array = new int[ans.size()];
for ( i = 0; i < ans.size(); i++) {
    array[i] = ans.get(i);
}

return array;
    }
}