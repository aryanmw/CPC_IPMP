public class Q15 {

    static void rearrange(int[] arrTp){

        int nL = arrTp.length;
        int start = 0;
        int end = nL-1;
        while(start < end){
            if(arrTp[start] %2 != 0 && arrTp[end] % 2 == 0){
                int temp = arrTp[start];
                arrTp[start] = arrTp[end];
                arrTp[end] = temp;
            }
            if(arrTp[start] %2 == 0){
                start++;
            }
            if(arrTp[end] %2 != 0){
                end--;
            }
        }



        for(int j = 0 ; j < nL ; j++){
            System.out.print(arrTp[j] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 45, 9, 8, 90, 3};
        rearrange(arr);
    }
}
