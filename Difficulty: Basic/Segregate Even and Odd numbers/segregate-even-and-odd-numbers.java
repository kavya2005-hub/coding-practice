class Solution {
    void segregateEvenOdd(int arr[]) {
        Arrays.sort(arr);

        int[] res = new int[arr.length];
        int j = 0;

        // Even numbers
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                res[j] = arr[i];
                j++;
            }
        }

        // Odd numbers
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                res[j] = arr[i];
                j++;
            }
        }

        // Copy back
        for(int i = 0; i < arr.length; i++) {
            arr[i] = res[i];
        }
    }
}