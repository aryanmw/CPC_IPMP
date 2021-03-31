public class Q18 {
    static void sortZeroesOnesTwos(int[] arr){
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] == 0){
                count0++;
            }
            else if (arr[i] == 1){
                count1++;
            }
            else{
                count2++;
            }
        }

        int index1 = count0;
        int index2 = index1 +count1;
        int j = 0;
        int p = 0;

        while (count0 > 0 || count1 > 0 || count2 > 0){
            if (count0 > 0){
                arr[p] = 0;
                count0--;
                p++;
            }
            if (count1 > 0){
                arr[index1] = 1;
                index1++;
                count1--;
            }
            if (count2 > 0){
                arr[index2] = 2;
                count2--;
                index2++;
            }




        }


        for(int k = 0 ; k < arr.length ; k++){
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        sortZeroesOnesTwos(arr);
    }
}
