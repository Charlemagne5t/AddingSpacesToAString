class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i != s.length()) {
            if (j == spaces.length) {
                while (i < s.length()) {
                    sb.append(s.charAt(i));
                    i++;
                }
            } else {
                while (i < spaces[j]) {
                    sb.append(s.charAt(i));
                    i++;
                }
                sb.append(' ');
                j++;
            }
        }

        return sb.toString();
    }
}