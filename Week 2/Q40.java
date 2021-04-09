import java.util.ArrayList;
import java.util.Collections;

public class Q40 {
    static ArrayList<Integer> leadersOfArray(int[] arr, int n){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[n-1]);
        int max = arr[n-1];
        for (int i = n - 2 ; i >= 0 ; i--){
            if (arr[i] >= max ){
                max = arr[i];
                list.add(max);
            }
        }
        Collections.reverse(list);

        return list;
    }

    public static void main(String[] args) {

    }
}
