class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int[] arr = new int[n*n];

        for(int i=0; i<n*n; i++){
            arr[i] = matrix[i/n][i%n];
        }

        Arrays.sort(arr);

        return arr[k-1];
    }
}
