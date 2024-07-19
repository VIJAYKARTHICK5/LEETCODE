class Solution {
    public String truncateSentence(String s, int k) {
        int n = s.length();
        StringBuilder str = new StringBuilder();
        int count = 0;        
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ' ') {
                count++;
                if (count == k) {
                    break;
                }
            }
            str.append(s.charAt(i));
        }
        
        return str.toString();
    }
}
