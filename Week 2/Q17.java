public class Q17 {
    static boolean findElementIn2DArray(int[][] arr , int val){
        if (arr[arr.length - 1][arr[0].length-1] < val){
            return false;
        }
        int i = 0 ; int j = arr[0].length-1;
        while(i < arr.length && j >= 0){
            if (arr[i][j] == val){
                return true;
            }
            else if (arr[i][j] > val){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
}
