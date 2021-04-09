import java.util.Arrays;

public class Q7 {



    static void minTripleSequence(int[] arr){
        int n = arr.length;
        int min = 0;
        int max = n-1;
        int[] smaller = new int[n];
        int[] greater = new int[n];
        smaller[0]= -1;
        greater[n-1] = -1;

        for (int i = 1 ; i < n ; i++){
            if (arr[i] <= arr[min]){
                min = i;
                smaller[i] = -1;
            }
            else{
                smaller[i] = min;
            }
        }

        for (int i = n-2 ; i>=0 ; i--){
            if (arr[i] >= arr[max]){
                max = i;
                greater[i] = -1;
            }
            else{
                greater[i] = max;
            }
        }

        System.out.println(Arrays.toString(smaller));
        System.out.println(Arrays.toString(greater));

        for (int i = 0 ; i < n ; i++){
            if (smaller[i] != -1 && greater[i] != -1){
                System.out.println(arr[smaller[i]] + " " + arr[i] + " "+arr[greater[i]]);
                return;
            }
        }


        System.out.println("No sequence");

    }

    public static void main(String[] args) {
        int[] arr = {1,2,-1,7,5};
        minTripleSequence(arr);
    }
}
