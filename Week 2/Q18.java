import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q18 {
    static void printSpiral(int[][] arr){
        boolean[][] visited = new boolean[arr.length][arr[0].length];
        boolean doingColumn = false;
        int i = 0;
        int j = 0;
        int row = 0;
        int col = 0;
        List<Integer> list = new ArrayList<>();
        boolean forward = true;
        boolean upward = false;

        while(i <= arr.length){
            if (!doingColumn){
                if (forward){
                    while(j < arr[0].length && !visited[i][j]){
                        list.add(arr[i][j]);
                        visited[i][j] = true;
                        j++;

                    }
                    doingColumn = true;
                    upward = false;
                    i++;
                    j--;
                }
                else{
                    while(j >= 0 && !visited[i][j]){
                        list.add(arr[i][j]);
                        visited[i][j] = true;
                        j--;
                    }
                    i--;
                    j++;
                    doingColumn = true;
                    upward = true;
                }

            }

            else if (doingColumn){
                if (!upward){
                    if (i < arr.length  ){
                        if (!visited[i][j]){
                            list.add(arr[i][j]);
                            visited[i][j] = true;
                            i++;
                        }
                        else{
                            i--;
                            j--;
                            forward = false;
                            doingColumn = false;
                        }


                    }
                    else{

                        i--;
                        j--;
                        forward = false;
                        doingColumn = false;
                    }


                }
                else if (upward){
                    if (!visited[i][j] && i >= 0){
                        list.add(arr[i][j]);
                        visited[i][j] = true;
                        i--;

                    }
                    else{
                        i++;
                        j++;
                        forward = true;
                        doingColumn = false;
                    }
                }
            }

            if (list.size() == arr.length*arr[0].length){
                break;
            }

        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        int a[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
                { 17, 18, 19, 20}};

        printSpiral(a);

        //System.out.println(Arrays.toString(a[0]));
    }
}
