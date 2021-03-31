public class Q21 {
    static int titleToNumber(String columnTitle) {
        int def = 'A';
        int len = columnTitle.length();
        int col = 0;



        for (int i = len-1 ; i >= 0 ; i--){

            int ascii = columnTitle.charAt(i);
            int faceVal = ascii - def + 1;
            int power = len - i - 1;
            int val = (int) Math.pow(26,power) * faceVal;
            col += val;




        }

        return col;

    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("ABCD"));
    }
}
