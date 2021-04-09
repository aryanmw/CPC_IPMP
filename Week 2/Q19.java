import java.util.ArrayList;

public class Q19 {
    static class Coordinates{
        int row,col;

        public Coordinates(int row, int col) {
            this.row = row;
            this.col = col;
        }

        public int getRow() {
            return row;
        }

        public int getCol() {
            return col;
        }
    }

    static void convertIntoBool(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;
        ArrayList<Integer> presentRow = new ArrayList<>();
        ArrayList<Integer> presentCol = new ArrayList<>();

        for (int i = 0 ; i < r ; i++){
            for (int j = 0 ; j < c ; j++){
                if (arr[i][j] == 1){
                    //Coordinates coords = new Coordinates(i,j);
                    presentRow.add(i);
                    presentCol.add(j);
                }
            }
        }

        for (int i = 0 ; i < r ; i++){
            for (int j = 0 ; j < c ; j++){
                if (presentRow.contains(i) || presentCol.contains(j)){
                    arr[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }




    }

    public static void main(String[] args) {
        int mat[ ][ ] = { {1, 0, 0, 0},
                {0, 0, 0, 1},
                {0, 0, 0, 0},};

        convertIntoBool(mat);
    }
}
