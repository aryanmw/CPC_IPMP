import java.util.Arrays;

public class Q3 {
    static boolean findTripletSumExists(int[] arr, int n, int x){
        boolean doesExist = false;
        Arrays.sort(arr);
        for (int i = 0 ; i < n ; i++){
            int diff = x - arr[i];
            int left = i+1;
            int right = n-1;
            while(left < right){
                if (i == left){
                    left++;
                }
                else if (i == right){
                    right--;
                }
                else if (arr[left] + arr[right] < diff){
                    left++;
                }
                else if (arr[left] + arr[right] > diff){
                    right--;
                }
                else if(arr[left] + arr[right] == diff){
                    doesExist = true;
                    System.out.println(arr[i] + " "+ arr[left] + " "+arr[right]);
                    //return doesExist;
                    right--;
                }
            }

        }
        return doesExist;
    }





    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1};
        findTripletSumExists(arr,arr.length,0);
    }
}
