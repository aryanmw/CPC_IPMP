public class Q17 {
    static void moverZeroesToEnd(int[] arr){
        int nL = arr.length;
        int start = 0;
        int end = start + 1;

        while(end < nL){
            if (arr[start] == 0 && arr[end] != 0){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end++;
                continue;
            }
            else if (arr[start] != 0){
                start++;
                end++;
            }
            else if (arr[end] == 0){
                end++;
            }
        }

        for(int j = 0 ; j < nL ; j++){
            System.out.print(arr[j] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        moverZeroesToEnd(arr);
    }
}
