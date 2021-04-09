public class Q30 {
    static int sumOfAscendingSubArray(int[] arr){
        int n = arr.length;
        int sum = arr[0];
        int maxSum = 0;

        for (int i = 1 ; i < n ; i++){
            if (arr[i] > arr[i-1]){
                sum+=arr[i];
            }
            else{
                if (sum > maxSum){
                    maxSum = sum;
                }
                sum = arr[i];
            }
        }

        return Math.max(sum,maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        sumOfAscendingSubArray(arr);
    }
}

