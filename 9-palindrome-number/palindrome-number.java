class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;

        int i,num=0,tem=x;
        while(tem!=0){
            num*=10;
            num = num + tem%10;
            tem = tem/10;
            
        }
        return num==x ? true : false;
    }
}