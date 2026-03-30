class Solution {
    public int earliestTime(int[][] tasks) {

        int i,ans= tasks[0][0] + tasks[0][1];

        for(i =0;i<tasks.length;i++){
                if(tasks[i][0] + tasks[i][1]  < ans)
                ans =tasks[i][0] + tasks[i][1];
        }

        return ans;
        
    }
}