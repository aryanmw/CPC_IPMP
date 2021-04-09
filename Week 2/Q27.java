import java.util.ArrayList;

public class Q27 {
    static ArrayList<Integer> subArrayWithGivenSum(int[] arr, int target){
        int n = arr.length;
        int i = 0, back = 0, sum = 0;
        boolean found = false;

        while(back < n){
            if (sum < target){
                if (i == n){
                    break;
                }
                sum += arr[i];
                i++;
            }
            else if (sum > target){
                sum -= arr[back];
                back++;
            }

            if (sum == target){
                found = true;
                break;
            }

        }
        ArrayList<Integer> list = new ArrayList<>();
        if (found){
            for (int j = back ; j < i ; j++){
                list.add(arr[j]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int arr1[] = {1, 4, 31, 3, 10, 5};
        int arr2[] = {135 ,101 ,170 ,125 ,79 ,159 ,163 ,65 ,106 ,146 ,82 ,28 ,162 ,92 ,196 ,143 ,28 ,37 ,192 ,5 ,103 ,154 ,93 ,183 ,22, 117, 119, 96, 48, 127, 172, 139, 70, 113, 68, 100, 36, 95, 104, 12, 123, 134};

        subArrayWithGivenSum(arr2,468);
    }
}
