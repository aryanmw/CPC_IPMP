public class Q23 {
    static boolean isPalindrome(int x) {
        String myNum = x +"";
        char[] arrPal = myNum.toCharArray();
        int palLen = arrPal.length;
        for (int i = 0 ; i < palLen/2 ; i++){
            int swapIndex = palLen - i - 1;
            char temp = arrPal[i];
            arrPal[i] = arrPal[swapIndex];
            arrPal[swapIndex] = temp;
        }

        String rev = new String(arrPal);
        if (rev.equals(myNum)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
