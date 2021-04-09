import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class Q4 {
    static int[][] findTripletSumExists(long[] arr){

        int x = 0;
        int pair = 0;
        int n = arr.length;
        long[][] ans = new long[n][3];
        long[] zeroArray = {0,0,0};
        int caseTripleZero = 0;
        Arrays.sort(arr);

        for (int i = 0 ; i < n ; i++){
            long diff = x - arr[i];
            int left = 0;
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

                    long[] ansArr = {arr[i], arr[left], arr[right]};
                    Arrays.sort(ansArr);
                    boolean exists = ifPairExists(ans,ansArr);
                    if (Arrays.equals(ansArr,zeroArray) && caseTripleZero == 0){
                        ans[pair] = ansArr;
                        pair++;
                        caseTripleZero++;
                    }
                    else if (!exists){
                        ans[pair] = ansArr;
                        pair++;
                    }
                    //set.add(Arrays.toString(ansArr));
                    //System.out.println(arr[i] + " "+ arr[left] + " "+arr[right]);
                    //return doesExist;
                    right--;
                }
            }

        }
        //System.out.println(set);
        // return doesExist;
        int[][] pairs = new int[pair][3];

        for (int i = 0 ; i< pair ; i++){
            for(int j = 0 ; j < 3 ; j++){
                pairs[i][j] = (int) ans[i][j];
            }
        }


        return pairs;
    }

    static boolean ifPairExists(long[][] q,long[] arrCheck){
        boolean isThere = false;

        for (int i = 0 ; i < q.length ; i++){
            if (Arrays.equals(q[i],arrCheck)){
                isThere = true;
                break;
            }
            else{

            }
        }
        return isThere;

    }

    public static void main(String[] args) {
        long[] arr = { 2147483647, -2147483648, -2147483648, 0, 1};
        int[][] p = findTripletSumExists(arr);

        for (int i = 0 ; i < p.length ; i++){
            for (int j = 0 ; j < 3 ; j++){
                System.out.print(p[i][j] + " ");
            }
            System.out.println("");
        }


        //System.out.println(Arrays.toString(arr));
    }
}
