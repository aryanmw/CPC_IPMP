import java.util.Arrays;

public class Q9 {
    static int[] sumClosestToZero(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int minSum = Integer.MAX_VALUE;
        int[] vals = new int[2];

        Arrays.sort(arr);

        while(left < right){
            int tempSum = arr[left] + arr[right];
            if (tempSum > 0){
                if (Math.abs(tempSum) < Math.abs(minSum)){
                    minSum = tempSum;
                    vals[0] = arr[left];
                    vals[1] = arr[right];
                }
                right--;
            }
            else{
                if (Math.abs(tempSum) < Math.abs(minSum)){
                    minSum = tempSum;
                    vals[0] = arr[left];
                    vals[1] = arr[right];
                }
                left++;
            }
        }

        System.out.println(Arrays.toString(vals));

        return vals;
    }

    public static void main(String[] args) {
        int[] arr = {-21, -67, -37, -18, 4, -65};
        sumClosestToZero(arr);
    }
}


