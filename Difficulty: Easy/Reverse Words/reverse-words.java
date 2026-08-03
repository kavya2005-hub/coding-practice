class Solution {
    public String reverseWords(String s) {
        s.trim();
        String[]word=s.split("\\.");
        
        StringBuilder sb=new StringBuilder();
        for(int i=word.length-1;i>=0;i--)
        {
          
            if(word[i].isEmpty())
            {
                continue;
            }
            if(sb.length()>0)
            {
                sb.append(".");
            }
              sb.append(word[i]);
        }
        return sb.toString();
        
    }
}
