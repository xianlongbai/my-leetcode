//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。 
//
// 示例: 
//
// 输入: [0,1,0,3,12]
//输出: [1,3,12,0,0] 
//
// 说明: 
//
// 
// 必须在原数组上操作，不能拷贝额外的数组。 
// 尽量减少操作次数。 
// 
// Related Topics 数组 双指针


package leetcode.editor.cn;

import java.util.Arrays;

//Java：移动零
public class P283MoveZeroes {
    public static void main(String[] args) {
        Solution solution = new P283MoveZeroes().new Solution();
        // TO TEST
        int[] nums = {0,4,0,5,9,6};
        solution.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

        //方法四(交换思想)：
//    public void moveZeroes(int[] nums) {
//        int j = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                int temp = nums[j];
//                nums[j] = nums[i];
//                nums[i] = temp;
//                j++;
//            }
//        }
//    }

    //方法三：解题思路：统计0的个数，如果count大于0，将非0元素直接移到当前位置减去0元素个数的位置上，将当前元素用0填充
//    public void moveZeroes(int[] nums) {
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i]==0) {
//                count++;
//            } else if (count > 0) {
//                nums[i-count] = nums[i];
//                nums[i] = 0;
//            }
//        }
//    }

    //方法二：
//    public void moveZeroes(int[] nums) {
//        int curt = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                nums[curt] = nums[i];
//                curt++;
//            }
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (i >= curt){
//                nums[i] = 0;
//            }
//        }
//    }
//
    //方法二(优化)：
//    public void moveZeroes(int[] nums) {
//        int curt = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                nums[curt] = nums[i];
//                curt++;
//            }
//        }
//        for (; curt < nums.length; curt++) {
//            nums[curt] = 0;
//        }
//    }

    //方法一：
//    public void moveZeroes(int[] nums) {
//        int j = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i]!=0) {
//                nums[j] = nums[i];
//                if (i!=j) {
//                    nums[i] = 0;
//                }
//                j++;
//            }
//        }
//    }

        //方法一(调整)：
//    public void moveZeroes(int[] nums) {
//        int j = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i]!=0) {
//                if (i > j) {
//                    nums[j] = nums[i];
//                    nums[i] = 0;
//                }
//                j++;
//            }
//        }
//    }

    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (j != i) {
                    nums[i] = 0;
                }
                j++;
            }
        }
    }














}
//leetcode submit region end(Prohibit modification and deletion)

}