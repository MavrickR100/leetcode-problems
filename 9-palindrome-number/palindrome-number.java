class Solution {
    public boolean isPalindrome(int x) {
        int i,j=0,ans=0,tem=x;

if(x <0) return false;

        while(tem != 0){
           ans*=10;
            j= tem%10;
            ans+=j;
            tem/=10;
        }

        if(ans == x )return true;

        return false;
        
    }
}