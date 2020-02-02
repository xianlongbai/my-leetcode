//给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。 
//
// 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。 
//
// 你可以假设除了整数 0 之外，这个整数不会以零开头。 
//
// 示例 1: 
//
// 输入: [1,2,3]
//输出: [1,2,4]
//解释: 输入数组表示数字 123。
// 
//
// 示例 2: 
//
// 输入: [4,3,2,1]
//输出: [4,3,2,2]
//解释: 输入数组表示数字 4321。
// 
// Related Topics 数组


package leetcode.editor.cn;

import java.util.Arrays;

//Java：加一
public class P66PlusOne{
    public static void main(String[] args) {
        Solution solution = new P66PlusOne().new Solution();
        // TO TEST
        int[] nums = {1, 2, 3};
        solution.plusOne(nums);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

//    public int[] plusOne(int[] digits) {
//        for (int length = digits.length-1; length >= 0; length--) {
//            digits[length]++;
//            digits[length] = digits[length] % 10;
//            if (digits[length] != 0) return digits;
//        }
//        digits = new int[digits.length+1];
//        digits[0] = 1;
//        return digits;
//
//    }


    public int[] plusOne(int[] digits) {
        for (int n = digits.length-1; n >= 0; n--) {
            digits[n]++;
            digits[n] %= 10;
            if (digits[n] != 0) {
                return digits;
            }
        }
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }



}
//leetcode submit region end(Prohibit modification and deletion)















}