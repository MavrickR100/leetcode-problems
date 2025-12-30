class Solution {
    public int findClosest(int x, int y, int z) {
        int xz=Math.abs(x-z),yz=Math.abs(y-z);
        if(xz==yz) return 0;
        if(xz<yz){
            return 1;
        }else{
            return 2;
        }
    }
}