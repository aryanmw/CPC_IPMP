public class Q7 {
    static int[] findMissingAndRepeating(int[] A){
        int n = A.length;
        int[] present = new int[n+1];
        for (int i = 0 ; i < n ; i++){
            present[A[i]]++;
        }

        int rep = 0;
        int miss = 0;
        for (int i = 0; i < n + 1 ; i++){
            if (present[i] == 0){
                miss = i;
            }
            if (present[i] == 2){
                rep = i;
            }
        }

        int[] ans = new int[2];
        ans[0] = rep;
        ans[1] = miss;
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,3,1,4};
        int[] output = findMissingAndRepeating(arr);
    }
}
