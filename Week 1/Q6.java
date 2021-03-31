public class Q6 {
    static int firstMissingPositiveInteger(int[] A){


        int n = A.length;
        boolean[] present = new boolean[n+1];
        for(int i =0; i < A.length; i++){
            if(A[i] >0 && A[i] <= n){
                present[A[i]] = true;
            }
        }

        if(n == 0){
            System.out.println(1);
            return 1;
        }

        for (int i = 1; i <= n; i++){
            if (!present[i]){
                System.out.println(i);
                return i;

            }




        }
        System.out.println(n+1);
        return n + 1;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,3,1,4};
        int output = firstMissingPositiveInteger(arr);

    }
}
