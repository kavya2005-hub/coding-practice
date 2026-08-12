class Solution {
    public int hammingWeight(int n) {
        String res="";
        int count=0;
       while(n>0)
       {
        if(n % 2==1)
        {
            res+='1';
        }
        else
        {
            res+='0';
        }
        n=n/2;
       }
       for(int i=0;i<res.length();i++)
       {
        if(res.charAt(i)=='1')
        {
            count++;
        }
       }
       return count;
    }
}