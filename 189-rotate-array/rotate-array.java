class Solution {

    public void swap(int arr[], int start, int end){
        int tem =0;
        while(start < end ){
            tem = arr[start];
            arr[start] = arr[end];
            arr[end] = tem;
            start++;end--;
        }
    }

    public void rotate(int[] nums, int k) {
        k = k% nums.length;
        int i=0,j=nums.length-k;
        swap(nums,i,j-1);
        i=nums.length-k;
        j=nums.length;
        swap(nums,i,j-1);
        swap(nums,0,nums.length-1);
    }
}

// k= 4

// 1 2 3
// 3 1 2
// 2 3 1
// 1 2 3
// 3 1 2