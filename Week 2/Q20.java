import java.util.ArrayList;

public class Q20 {

    static void printDiagonal(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;

        int i = 0;
        int j = 0;
        int initI = 0;
        int initJ = 0;
        int count = 0;
        boolean downward = true;

        ArrayList<Integer> list = new ArrayList<>();

        while(i <= r){


            if (downward){
                if (i>=0 && i<r && j>=0 && j<c){
                    list.add(arr[i][j]);
                    System.out.print(arr[i][j] +" ");
                    count++;
                    i--;
                    j++;
                }
                else{
                    if (initI == r-1){
                        downward = false;
                        initJ++;
                        i = initI;
                        j = initJ;
                    }
                    else{
                        initI++;
                        i = initI;
                        j = initJ;
                    }
                    System.out.println();

                }
            }
            else{

                if (i>=0 && i<r && j>=0 && j<c){
                    list.add(arr[i][j]);
                    System.out.print(arr[i][j] +" ");
                    count++;
                    i--;
                    j++;
                }
                else{
                    initJ++;
                    j = initJ;
                    i = initI;
                    System.out.println();
                }
            }

            if (count == r*c){
                break;
            }




        }

        //System.out.println(list);

    }

    public static void main(String[] args) {
        int M[][] = {
                { 1, 2, 3, 4 },     { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },  { 13, 14, 15, 16 },
                { 17, 18, 19, 20 },
        };

        printDiagonal(M);
    }
}
