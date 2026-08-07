class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int[]n=new int[a.length+b.length];
        int m=0;
        for(int i=0;i<a.length;i++)
        {
            n[m]=a[i];
            m++;
        }
        for(int j=0;j<b.length;j++)
            {
                n[m]=b[j];
                m++;
            }
            Arrays.sort(n);
            return n[k-1];
    }
}