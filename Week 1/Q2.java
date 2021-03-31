import java.util.ArrayList;

public class Q2 {
    static void intersectionOfArrays(int[] arr1, int[] arr2){
        int smallLen = 0;
        int smallIndex = 0;
        int length = 0;
        if (arr1.length >= arr2.length){
            length = arr1.length;
            smallLen = arr2.length;

        }
        else {
            length = arr2.length;
            smallLen = arr1.length;
            int[] temp = arr1;
            arr1 = arr2;
            arr2 = temp;
        }
        int i = 0;
        ArrayList<Integer> intersection = new ArrayList<>();
        int pushVal = Integer.MIN_VALUE;
        while(i < length){
            if (smallIndex < smallLen){
                if (arr1[i] < arr2[smallIndex]){
                    i++;
                    pushVal = Integer.MIN_VALUE;
                }
                else if (arr1[i] > arr2[smallIndex]){
                    smallIndex++;
                    pushVal = Integer.MIN_VALUE;
                }
                else {
                    pushVal = arr1[i];
                }
            }
            else{
                break;

            }


            if (pushVal != Integer.MIN_VALUE){
                intersection.add(pushVal);
            }
        }
        System.out.println(intersection);
    }
    static void unionOfArrays(int[] arr1, int[] arr2){

        int length = 0;
        int smallLen = 0;
        int bigArray = 0;int smallArray = 0;

        if (arr1.length >= arr2.length){
            length = arr1.length;
            smallLen = arr2.length;

        }
        else {
            length = arr2.length;
            smallLen = arr1.length;
            int[] temp = arr1;
            arr1 = arr2;
            arr2 = temp;
        }

        ArrayList<Integer> union = new ArrayList<>();
        int pushVal = 0;
        int i = 0;
        while (i < length){

            int smallEl = Integer.MIN_VALUE;
            if (smallArray < smallLen){
                smallEl = arr2[smallArray];
            }

            int bigEl = arr1[i];
            if (bigEl > smallEl){
                if (smallEl == Integer.MIN_VALUE ){
                    if ( i > 0 && bigEl == arr1[i-1]){
                        pushVal = Integer.MIN_VALUE;
                        i++;
                        smallArray++;
                    }
                    else{
                        pushVal = bigEl;
                        i++;
                    }
                }
                else if(smallArray > 0 && arr2[smallArray-1] == smallEl){
                    if ( i > 0 && bigEl == arr1[i-1]){
                        i++;
                        pushVal = Integer.MIN_VALUE;

                    }
                    else{
                        pushVal = bigEl;
                        i++;
                    }

                    smallArray++;
                }
                else{
                    pushVal = smallEl;
                    smallArray++;
                }
            }
            else if (smallEl > bigEl){
                if (i > 0 && arr1[i-1] == bigEl && smallEl != Integer.MIN_VALUE){
                    if ( smallArray > 0 && smallEl == arr2[smallArray-1]){
                        pushVal = Integer.MIN_VALUE;
                        i++;
                        smallArray++;
                    }
                    else{
                        pushVal = smallEl;
                        i++;
                        smallArray++;
                    }


                }
                else{
                    pushVal = bigEl;
                    i++;
                }

            }
            else if (smallEl == bigEl){
                if ((i > 0 && bigEl == arr1[i-1]) || (smallArray > 0 && smallEl == arr2[smallArray-1])){
                    pushVal = Integer.MIN_VALUE;
                }
                else{
                    pushVal = bigEl;
                }

                i++;
                smallArray++;
            }
            if (pushVal != Integer.MIN_VALUE){
                union.add(pushVal);
            }

        }

        while(smallArray < smallLen){
            if (arr2[smallArray-1] != arr2[smallArray]){
                union.add(arr2[smallArray]);
            }
            smallArray++;
        }
        System.out.println(union);
    }

    public static void main(String[] args) {
        int[] arr2 = {1, 1, 1, 1};
        int[] arr1 = {2, 2, 2, 2, 2};
        unionOfArrays(arr1,arr2);
        intersectionOfArrays(arr1,arr2);
    }
}
