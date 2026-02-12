class Solution {
    public int trap(int[] height) {
        int size = height.length, l=0,r=size-1,lmax=0,rmax=0,ans=0;


    while(l<r){
        lmax = Math.max(lmax,height[l]);
        rmax = Math.max(rmax,height[r]);

        if(lmax < rmax){
            ans += lmax-height[l];
            l++; 
        }else{
            ans+= rmax-height[r];
            r--;
        }

    }

    return ans;

        
    }
}