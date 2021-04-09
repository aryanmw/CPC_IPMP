import java.util.Arrays;

public class Q13 {
    static void productPuzzle(int[] arr){
        int n = arr.length;
        int[] productArray = new int[n];
        Arrays.fill(productArray,1);

        for(int i = 1 ; i < n ; i++){
            productArray[i] = productArray[i-1] * arr[i-1];
        }

        int temp = 1;

        for (int i = n - 1; i >= 0; i--) {
            productArray[i] *= temp;
            temp *= arr[i];
        }

        System.out.println(Arrays.toString(productArray));
    }

    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6 ,2};
        productPuzzle(arr);
    }
}
