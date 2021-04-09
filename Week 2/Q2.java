import java.util.HashSet;

public class Q2 {
    static boolean checkForPairWithGivenSum(int[] arr, int n, int x){
        HashSet<Integer> set = new HashSet<>();
        boolean doesExist = false;

        for (int i = 0 ; i < arr.length ; i++){
            int diff = x - arr[i];

            if (set.contains(diff)){
                //System.out.println(arr[i] + " + "+ diff +" = " +x);
                doesExist = true;
                break;
            }
            else{
                set.add(arr[i]);
            }
        }
        return doesExist;
    }

    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        boolean doesExist = checkForPairWithGivenSum(arr,arr.length,-2);
        System.out.println();
    }
}
