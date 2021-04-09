public class Q38 {
    static int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;

    }

    public static void main(String[] args) {
        int[] arr = {1,7,5,6,2,1};
        System.out.println(maxProfit(arr));
    }
}
