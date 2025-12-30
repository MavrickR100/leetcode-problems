class Solution {
    public int maxFreqSum(String s) {
        int[] vowel = new int[26];
        int[] consonant = new int[26];

        int i,j,maxV=0,maxC=0;
        char c;
        for(i=0;i<s.length();i++){
            c=s.charAt(i);

            if(c=='a' || c=='e' || c=='i'|| c=='o'|| c=='u'){
                vowel[c-'a']++;
            }else{
                consonant[c-'a']++;
            }
        }

        for(i=0;i<26;i++){
            if(vowel[i] > maxV){
                maxV=vowel[i];
            }
            if(consonant[i] > maxC){
                maxC=consonant[i];
            }
        }
        return maxV+maxC;
    }
}