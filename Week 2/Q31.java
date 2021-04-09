import java.util.ArrayList;
import java.util.Scanner;

public class Q31 {
    static int niceSubArrays(int[] arr, int k){
        int subArrayCount = 0;
        int oddCount = 0;




        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] % 2 != 0){
                oddCount++;
            }
            if (oddCount == k){
                subArrayCount++;

            }
            if (oddCount == k && i+1< arr.length && arr[i+1] % 2 != 0){
                oddCount = 0;
            }
            else{
                for (int j = i+1 ; j < arr.length ; j++){


                    if (arr[j] % 2 != 0){
                        oddCount++;
                    }
                    if (oddCount == k){
                        subArrayCount++;


                    }
                    else if (oddCount > k){
                        oddCount = 0;
                        break;
                    }


                }
            }

            oddCount = 0;
        }
        return subArrayCount;
    }

    public static void main(String[] args) {
        int[] arr = {45627,50891,94884,11286,35337,46414,62029,20247,72789,89158,54203,79628,25920,16832,47469,80909};
        System.out.println(niceSubArrays(arr,1));



    }

}
