import java.util.HashMap;

public class Q28 {
    static void maxSubArrayWithEqualZerosAndOnes(int[] arr){
        int n = arr.length;
        int count0= 0 , count1 = 0;
        for (int i = 0 ; i < n ; i++){
            if (arr[i] == 0){
                count0++;
            }
            else{
                count1++;
            }
        }

        if (count0 == 0 || count1 == 0){
            System.out.println("No sub-array possible");
            return;
        }
        else if (count0 == count1){
            System.out.println("1 "+n);
        }
        int reqdCount = Math.min(count0,count1);
        int c0 = 0, c1 = 0;
        

    }
    static int maxLen(int arr[], int n)
    {
        // Creates an empty hashMap hM

        HashMap<Integer, Integer> hM
                = new HashMap<Integer, Integer>();

        // Initialize sum of elements
        int sum = 0;

        // Initialize result
        int max_len = 0;
        int ending_index = -1;
        int start_index = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = (arr[i] == 0) ? -1 : 1;
        }

        // Traverse through the given array

        for (int i = 0; i < n; i++) {
            // Add current element to sum

            sum += arr[i];

            // To handle sum=0 at last index

            if (sum == 0) {
                max_len = i + 1;
                ending_index = i;
            }

            // If this sum is seen before,
            // then update max_len if required
            if (hM.containsKey(sum)) {
                if (max_len < i - hM.get(sum)) {
                    max_len = i - hM.get(sum);
                    ending_index = i;
                }
            }
            else // Else put this sum in hash table
                hM.put(sum, i);
        }

        for (int i = 0; i < n; i++) {
            arr[i] = (arr[i] == -1) ? 0 : 1;
        }

        int end = ending_index - max_len + 1;
        System.out.println(end + " to " + ending_index);

        return max_len;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 0, 0, 0, 1, 1 };
        int n = arr.length;

        maxLen(arr, n);
    }

}
