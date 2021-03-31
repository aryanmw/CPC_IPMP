public class Q16 {
    static void rearrange(int[] arrTp){

        int nL = arrTp.length;
        int start = 0;
        int end = nL-1;
        while(start < end){
            if(arrTp[start] > 0 && arrTp[end] < 0){
                int temp = arrTp[start];
                arrTp[start] = arrTp[end];
                arrTp[end] = temp;
            }
            if(arrTp[start] < 0){
                start++;
            }
            if(arrTp[end] > 0){
                end--;
            }
        }

        int neg = 0;
        int pos = 1;

        while(neg < pos && pos < nL){
            if (arrTp[neg] < 0 && arrTp[pos] > 0 && pos % 2 != 2){
                int temp = arrTp[neg];
                arrTp[neg] = arrTp[pos];
                arrTp[pos] = temp;
                neg+=2;
                pos++;
            }
            else{
                pos++;
            }
        }

        for(int j = 0 ; j < nL ; j++){
            System.out.print(arrTp[j] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        rearrange(arr);
    }
}
