class Solution {
    String uncommonChars(String s1, String s2) {
       HashSet<Character>set=new HashSet<>();
        HashSet<Character>set2=new HashSet<>();
       for(int i=0;i<s1.length();i++)
       {
           set.add(s1.charAt(i));
       }
       for(int i=0;i<s2.length();i++)
       {
           set2.add(s2.charAt(i));
       }
       String ans="";
       for(char ch='a';ch<='z';ch++)
       {
           if(set.contains(ch)&& !set2.contains(ch))
           {
               ans+=ch;
           }
           if(!set.contains(ch)&& set2.contains(ch))
           {
               ans+=ch;
           }
       }
       return ans;
        
    }
}