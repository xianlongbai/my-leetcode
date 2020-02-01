//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。 
//
// 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表


package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

//Java：两数之和
public class P1TwoSum{
    public static void main(String[] args) {
        Solution solution = new P1TwoSum().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    //方法一：
//    public int[] twoSum(int[] nums, int target) {
//        if (nums == null || nums.length < 2) return null;
//        for (int m = 0; m < nums.length-1; m++) {
//            for (int j = m+1; j < nums.length; j++) {
//                if (nums[m] + nums[j] == target) {
//                    return new int[]{m,j};
//                }
//            }
//        }
//        return null;
//    }

    //方法二（利用哈希表）：
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) return null;
        Map<Integer,Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int v = target - nums[i];
            if (map.containsKey(v)) {
                return new int[]{map.get(v),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }


}
//leetcode submit region end(Prohibit modification and deletion)

}