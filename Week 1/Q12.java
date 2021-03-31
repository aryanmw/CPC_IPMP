import java.util.ArrayList;

public class Q12 {
    static ArrayList<Integer> minimumComparisons(int[] a){
        ArrayList<Integer> minMax = new ArrayList<>();
        int max = 0;
        int min = 0;

        if (a.length == 1){
            minMax.add(a[0]);
            minMax.add(a[0]);
            return minMax;
        }
        if (a[0] > a[1]){
            max = a[0];
            min = a[1];
        }
        else{
            min = a[0];
            max = a[1];
        }
        int i = 0;
        if (a.length %2 == 0){
            i = 2;
        }
        else{
            i = 1;
        }

        for ( i = i ; i < a.length-1 ; i+=2){
            if (a[i] > a[i+1]){
                if (a[i] > max){
                    max = a[i];
                }
                if (a[i+1] < min){
                    min = a[i+1];
                }
            }

            else if (a[i] < a[i+1]){
                if (a[i+1] > max){
                    max = a[i+1];
                }
                if (a[i] < min){
                    min = a[i];
                }
            }
            else{
                if (a[i+1] > max){
                    max = a[i];
                }
                if (a[i+1] < min){
                    min = a[i+1];
                }
            }
        }
        minMax.add(min);
        minMax.add(max);
        System.out.println(minMax);
        return minMax;

    }

    public static void main(String[] args) {
        int[] a = {1000, 11, 4450, 6 , 1, 330, 3000, -2};
        minimumComparisons(a);
    }
}
