class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer> vowel = new HashMap<>();
        Map<Character,Integer> consonant = new HashMap<>();
        char c ;
        int maxV=0,maxC=0;
        int t;
        for(int i =0;i<s.length();i++){
            c=s.charAt(i);
            if(c=='a'|| c=='e' || c=='i'|| c=='o'|| c=='u'){
                if(vowel.containsKey(c)){
                    t=vowel.get(c);
                    vowel.put(c,++t);
                }else{
                vowel.put(c,1);
                }
            }else{
                if(consonant.containsKey(c)){
                    t=consonant.get(c);
                    consonant.put(c,++t);
                }else{
                consonant.put(c,1);
                }
            }
        }

        for(Map.Entry<Character,Integer> entry : vowel.entrySet()){
            if(entry.getValue() > maxV){
                maxV=entry.getValue();
            }
        }

        for(Map.Entry<Character,Integer> entry : consonant.entrySet()){
            if(entry.getValue()>maxC){
                maxC=entry.getValue();
            }
        }
return maxV+maxC;
        
    }
}