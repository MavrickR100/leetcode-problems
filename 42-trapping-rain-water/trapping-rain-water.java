class Solution {
    public int trap(int[] height) {
        int lMax=0,rMax=0;
        int i,j,size=height.length,ans=0;
        int[] left = new int[size];
        int[] right = new int[size];

        for( i=0;i<size;i++){
            if(lMax < height[i]){
                lMax =height[i];
            }
            left[i]=lMax;
        }

        for(i = size-1;i>=0;i--){
            if(rMax < height[i]){
                rMax = height[i];
            }
            right[i]=rMax;
        }

        for(i=0;i<size;i++){
            ans+=Math.min(left[i],right[i])-height[i];
        }
        
        

        return ans;
    }
}