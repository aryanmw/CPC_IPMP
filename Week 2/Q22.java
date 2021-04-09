import java.util.ArrayList;

public class Q22 {
    static void rightRotateMatrix(int[][] arr){

        ArrayList<ArrayList<Integer>> rotationMatrix = new ArrayList<>();

        int r = arr.length;
        int c = arr[0].length;

        for (int i = 0 ; i < r ; i++){
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0 ; j < c ; j++){
                row.add(arr[i][j]);
            }
            rotationMatrix.add(row);
        }

        int[][] newMat = new int[c][r];

        for (int j = 0 ; j < r ; j++){
            for (int i = 0 ; i < c ; i++){
                newMat[i][j] = rotationMatrix.get(r-1-j).get(i);
            }
        }

        System.out.println("After rotating :");

        for (int i = 0 ; i < c ; i++){

            for (int j = 0 ; j < r ; j++){
                System.out.format("%02d",newMat[i][j]);
                System.out.print(" ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int a[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                };

        System.out.println("Before rotating :");

        for (int i = 0 ; i < a.length ; i++){

            for (int j = 0 ; j < a[0].length ; j++){
                System.out.format("%02d",a[i][j]);
                System.out.print(" ");
            }
            System.out.println();

        }
        System.out.println();


        rightRotateMatrix(a);
    }
}
