class Solution {
    public String reversePrefix(String word, char ch) {

        int i, z = 0;

        for (i = 0; i < word.length(); i++) {

            if (word.charAt(i) == ch) {
                z = i;
                break;
            }
        }

        String br = new String(new StringBuilder(word.substring(0, z + 1)).reverse());
        br = br + word.substring(z + 1, word.length());
        return br.toString();

    }
}