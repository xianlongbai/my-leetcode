//给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。 
//
// 你可以假设数组是非空的，并且给定的数组总是存在多数元素。 
//
// 示例 1: 
//
// 输入: [3,2,3]
//输出: 3 
//
// 示例 2: 
//
// 输入: [2,2,1,1,1,2,2]
//输出: 2
// 
// Related Topics 位运算 数组 分治算法


package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
//import com.sun.security.jgss.GSSUtil;
//import com.sun.security.auth.module.Krb5LoginModule;

//Java：多数元素
public class P169MajorityElement{
    public static void main(String[] args) {
        Solution solution = new P169MajorityElement().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    //暴力方法
//    public int majorityElement(int[] nums) {
//        int middle = nums.length / 2;
//        for (int i = 0; i < nums.length; i++) {
//            int len = 0;
//            for (int j = 0; j < nums.length; j++) {
//                if (nums[i] == nums[j]) len++;
//            }
//            if (len > middle) return nums[i];
//        }
//        return -1;
//    }

    //哈希表方法
//    public int majorityElement(int[] nums) {
//        Map<Integer,Integer> map = new HashMap();
//        int middle = nums.length / 2;
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//            if (map.get(nums[i]) > middle) return nums[i];
//        }
//        return -1;
//    }


    //摩尔投票法
//    public int majorityElement(int[] nums) {
//        int res = nums[0], count = 1;
//        for (int i = 1; i < nums.length; i++) {
//            if (count == 0) {
//                res = nums[i];
//                count = 1;
//                continue;
//            }
//            if (nums[i] == res) count++; else count--;
//        }
//        return res;
//    }

    //利用栈数据结构(思想与投票一样)
//    public int majorityElement(int[] nums) {
//        Stack<Integer> stack = new Stack<>();
//        for (int num : nums) {
//            if (stack.isEmpty() || stack.peek() == num) stack.push(num);
//            else stack.pop();
//        }
//        return stack.peek();
//    }

    //复习一
//    public int majorityElement(int[] nums) {
//        Stack<Integer> stack = new Stack<>();
//        for (int num : nums) {
//            if (stack.isEmpty() || stack.peek() == num) stack.push(num);
//            else stack.pop();
//        }
//        return stack.peek();
//    }

    //复习二
    public int majorityElement(int[] nums) {
        int res = nums[0], count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) res = nums[i];
            if (res == nums[i]) count++;
            else count--;
        }
        return res;
    }

}

//leetcode submit region end(Prohibit modification and deletion)



















}