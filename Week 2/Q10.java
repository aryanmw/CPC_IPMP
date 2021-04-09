import java.util.HashSet;

public class Q10 {
    static boolean subArraySumZero(int[] arr){
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i = 0 ; i < n ; i++){
            sum += arr[i];

            if (arr[i] == 0 || set.contains(sum) || sum == 0){
                return true;
            }
            set.add(sum);
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, -2, -2, 5, -4, 3};
        System.out.println(subArraySumZero(arr));
    }
}
