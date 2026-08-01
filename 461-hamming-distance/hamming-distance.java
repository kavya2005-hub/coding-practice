class Solution {
    public int hammingDistance(int x, int y) {
        int count=Integer.bitCount(x^y);
        return count;
        
    }
}