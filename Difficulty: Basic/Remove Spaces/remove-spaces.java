class Solution {
    public String removeSpaces(String s) {
        String res="";

for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                res+=ch;
            }
        }
        return res;
    }
}