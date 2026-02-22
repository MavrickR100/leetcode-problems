class Solution {
    public String truncateSentence(String str, int k) {
	    int count =0,i=0;
	    for(i=0;i<str.length();i++){
	        
	        if(str.charAt(i) == ' '){
	            count++;
	        }
	        if(count == k){
	            break;
	        }
	    }
	    String ans = str.substring(0,i); 
        return ans;
    }
}