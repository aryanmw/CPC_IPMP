import java.util.ArrayList;
import java.util.Collections;

public class Q5 {
    static int tripletSumClosest(ArrayList<Long> arr, int B){
        long minSum = Integer.MAX_VALUE +2;
        long minActualSum = 0;
        Collections.sort(arr);
        for (int i = 0 ; i < arr.size() ; i++){
            int left = i+1;
            int right = arr.size()-1;
            while(left < right){
                if (Math.abs(arr.get(i) + arr.get(left) + arr.get(right) - B) < minSum){
                    minSum = Math.abs(arr.get(i) + arr.get(left) + arr.get(right) - B);
                    minActualSum = arr.get(i) + arr.get(left) + arr.get(right);
                }

                if (arr.get(i) + arr.get(left) + arr.get(right) < B){
                    left++;
                }
                if (arr.get(i) + arr.get(left) + arr.get(right) >= B){
                    right--;
                }
            }
        }

        return (int) minActualSum;
    }

    public static void main(String[] args) {
        ArrayList<Long> arr = new ArrayList<>();
        arr.add(2147483647l);
        arr.add(-2147483648l);
        arr.add(-2147483648l);
        arr.add(0l);
        arr.add(1l);

        System.out.println(tripletSumClosest(arr,0));
    }
}

//{-1 2 1 -4}
