import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        int[] nums = {3, 5, 4, 6};
        int target = 7;

        System.out.println(Arrays.toString(twoSumFunction(nums, target)));
    }

    public static int[] twoSumFunction(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++){
            int difference = target - nums[i];
            if(map.containsKey(difference)){
                result[0] = map.get(difference);
                result[1] = i;
            }else{
                map.put(nums[i], i);
            }
        }

        return result;
    }
}
