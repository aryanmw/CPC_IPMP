public class Q22 {
    static String convertToTitle(int orig) {
        String ans="";

        while(orig>26){
            int x=orig%26;
            if(x==0){
                ans=String.valueOf((char)(26 + 64));
                orig-=1;
            }
            else ans=String.valueOf((char)(x + 64))+ans;
            orig/=26;
        }
        ans=String.valueOf((char)(orig + 64))+ans;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(124));
    }
}
