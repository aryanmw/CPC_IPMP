public class Q11 {
    static int equilibriumIndex(int[] arr){
        int n = arr.length;
        if (n  == 1){
            return 1;
        }
        int sum = 0;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        for (int i = 0 ; i < n ; i++){
            sum += arr[i];
            leftSum[i] = sum;
        }
        sum = 0;
        for (int i = n-1 ; i >= 0 ; i--){
            sum += arr[i];
            rightSum[i] = sum;
        }

        for (int i = 0 ; i < n ; i++){
            if (leftSum[i] == rightSum[i]){
                return i+1;
            }
        }
        return -1;
    }
}
