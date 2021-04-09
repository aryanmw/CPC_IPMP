public class Q8 {
    static int firstOne(int[] arr,int low, int high ) {
        if (high >= low) {
            // Get the middle index

            int mid = (high + low) / 2;

            // Check if the element at middle index is first 1
            if ((mid == 0 || (arr[mid - 1] == 0)) && arr[mid] == 1)
                return mid;

            else if (arr[mid] == 0) {
                return firstOne(arr, mid + 1, high);
            } else {
                return firstOne(arr, low, mid);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] arr = { { 0, 0, 0, 1 },
                { 0, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 0, 0, 0, 0 } };

        int max = 0;
        int maxIndex = -1;
        for (int i = 0 ; i < arr.length ;i++){
            int firstApprnc = firstOne(arr[i],0,arr[i].length-1);
            int total = arr[i].length - firstApprnc;
            if (total > max && firstApprnc >= 0){
                max = total;
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
    }
}
