public class Q26 {
    static long maxProductOFSubArray(int[] arr){
        int n = arr.length;
        long maxUptillNow = 1;
        long prod = 1;
        long temp = 1;
        long prevMax = 1;

        for (int i = 0 ; i < n ; i++){

            if(arr[i] == 0){
                prod = 1;
                temp = 1;
                prevMax = maxUptillNow;
                maxUptillNow = 1;
            }
            else{
                temp = maxUptillNow;
                prod*=arr[i];
                temp *= arr[i];
                if (prod > Math.max(maxUptillNow,prevMax)){
                    if (maxUptillNow > prevMax){
                        prevMax = maxUptillNow;
                    }

                    maxUptillNow = prod;
                }
                else if (temp > Math.max(maxUptillNow,prevMax)){
                    if (maxUptillNow > prevMax){
                        prevMax = maxUptillNow;
                    }
                    maxUptillNow = temp;
                }
            }

        }
        return Math.max(maxUptillNow,prevMax);
    }

    public static void main(String[] args) {
        int[] arr = {9, 0, 8, -1, -2, -2, 6};
        System.out.println(maxProductOFSubArray(arr));
    }
}
