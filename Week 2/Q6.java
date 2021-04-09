import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q6 {
    static List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> answerList = new ArrayList<>();
        for (int i = 0 ; i < n ; i++){
            for (int j = i+1 ; j < n ; j++){
                int diff = target - (nums[i] + nums[j]);
                int left = j+1;
                int right = n-1;
                while(left<right){
                    if (nums[left]+nums[right] < diff){
                        left++;
                    }
                    else if (nums[left]+nums[right] > diff){
                        right--;
                    }
                    else if (nums[left]+nums[right]== diff){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        Collections.sort(list);
                        if (!answerList.contains(list)){
                            answerList.add(list);
                        }
                        right--;
                    }
                }
            }
        }
        System.out.println(answerList);
        return answerList;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,-1,0,-2,2};
        fourSum(arr,0);
    }
}
