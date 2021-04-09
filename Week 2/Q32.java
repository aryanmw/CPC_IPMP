public class Q32 {
    static int countOfSubArraysWithProductLessThanTarget(int[] arr, int k){
        int n = arr.length;
        int start = 0,end = 0,prod = 1,count = 0, origStart = 0;

        while(start < n || end < n){
            if (end < n){
                prod*=arr[end];
                if (prod < k  ){
                    if (start!=end){
                        count++;
                    }

                }
                else{
                    while(prod >= k && start < end){
                        prod/=arr[start];
                        start++;
                    }
                    if (start!=end){
                        count++;
                    }

                }
                end++;
                if (end == n){
                    if (start == n-1){
                        break;
                    }
                    else{
                        start++;
                        origStart = start;
                    }

                }
            }

            else{
                prod = 1;
                prod*=arr[start];

                if (prod < k ){
                    if (start != origStart){
                        count++;
                    }

                }
                start++;
                if (start == n && origStart!= n-1){
                    origStart++;
                    start = origStart;
                }



            }
        }
        for (int i = 0 ; i < n ; i++){
            if (arr[i] < k){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {10,2,2,5,4,4,4,3,7,7};
        countOfSubArraysWithProductLessThanTarget(arr,289);
    }
}
