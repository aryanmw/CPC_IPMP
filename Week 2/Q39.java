public class Q39 {
    static int twoTransactionMaxProf(int[] prices){
        int maxprofit = 0;
        int n = prices.length;
        if (n<=1){
            return 0;
        }
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = 0;
        right[n-1] = 0;
        int min = prices[0];
        for (int i = 1 ; i < n ; i++){

            left[i] = Math.max(left[i-1],prices[i] - min);
            if (prices[i] < min){
                min = prices[i];
            }
        }

        int max = prices[n-1];
        for (int i = n-2 ; i >= 0 ; i--){
            right[i] = Math.max(right[i+1],max - prices[i]);
            if (prices[i] > max){
                max = prices[i];
            }
        }

        for (int i = 1 ; i < n ; i++){
            if (right[i]+left[i] > maxprofit){
                maxprofit = right[i]+left[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,};
        System.out.println(twoTransactionMaxProf(arr));
    }
}
