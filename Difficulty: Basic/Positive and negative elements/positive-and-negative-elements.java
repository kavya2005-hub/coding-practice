class Solution {
    public ArrayList<Integer> arranged(int[] arr) {

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0;
        int j = 0;

        while(i < pos.size() && j < neg.size()) {
            ans.add(pos.get(i));
            i++;

            ans.add(neg.get(j));
            j++;
        }

        while(i < pos.size()) {
            ans.add(pos.get(i));
            i++;
        }

        while(j < neg.size()) {
            ans.add(neg.get(j));
            j++;
        }

        return ans;
    }
}