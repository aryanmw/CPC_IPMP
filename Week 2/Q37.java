public class Q37 {
    static int maxProfit(int[] arr){
        int n = arr.length;
        if (n == 0){
            return 0;
        }

        int min[] = new int[n];
        int max[] = new int[n];


        min[0] = arr[0];
        for (int i = 1 ; i < n ; i++){
            min[i] = Math.min(min[i-1],arr[i]);
        }

        max[n-1] = arr[n-1];
        for (int i = n-2 ; i >= 0 ; i--){
            max[i] = Math.max(max[i+1],arr[i]);
        }
        int profit = Integer.MIN_VALUE;
        for (int i = 0 ; i < n ; i++){
            int currVal = max[i] - min[i];
            if (currVal > profit){
                profit = currVal;
            }
        }
        if (profit < 0){
            return 0;
        }
        return profit;
    }



    public static void main(String[] args) {
        int arr[] = {2,3,4,};
        System.out.println(maxProfit(arr));
    }
}
