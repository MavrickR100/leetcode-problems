class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] ans = new int[accounts.length];
        int sum=0,k=0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[0].length;j++){
                sum+=accounts[i][j];
            }
            ans[k++]=sum;
            sum=0;
        }
        
        for(int i=0;i<ans.length;i++){
            if(ans[i]>sum){
                sum =ans[i];
            }
        }
        return sum;
    }
}