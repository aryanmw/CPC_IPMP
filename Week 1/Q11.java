public class Q11 {
    static void revString(String str){

        char[] charArray = str.toCharArray();
        int length = charArray.length;

        for (int i = 0 ; i < length/2 ; i++){
            int swapIndex = length - i - 1;
            char temp = charArray[i];
            charArray[i] = charArray[swapIndex];
            charArray[swapIndex] = temp;
        }
        str = new String(charArray);
        System.out.println(str);
    }

    public static void main(String[] args) {
        String str = "Hello";
        revString(str);
    }
}
