class Solution {
    public int longestPalindrome(String s) {
        int[] lower = new int[26];
        int[] upper = new int[26];
        
        boolean isOdd=false;
        int len=0;
        for (int j=0;j<s.length();j++) {
            if ((s.charAt(j)-'A')<26) upper[s.charAt(j)-'A']++;
            else lower[s.charAt(j)-'a']++;
        }
        for (int i=0;i<26;i++) {
            len+=(lower[i]/2+upper[i]/2);
            if (lower[i]%2==1 || upper[i]%2==1) isOdd=true;
        }
        return isOdd==true?len*2+1:len*2;
    }
}
