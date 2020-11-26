class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        boolean isOdd=false;
        int len=0;
        for (int j=0;j<s.length();j++) {
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
        }
        for (int i:map.values()) {
            len+=i/2;
            if (i%2==1) isOdd=true;
        }
        return isOdd==true?len*2+1:len*2;
    }
}
