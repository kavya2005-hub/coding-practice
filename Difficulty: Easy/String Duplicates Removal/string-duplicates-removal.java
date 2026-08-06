class Solution {
    String removeDuplicates(String s) {

        String res = "";

        for (int i = 0; i < s.length(); i++) {

            boolean found = false;

            for (int j = 0; j < i; j++) {

                if (s.charAt(i) == s.charAt(j)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                res += s.charAt(i);
            }
        }

        return res;
    }
}