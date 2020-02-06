//给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。 
//
// 示例: 
//
// 输入: [-2,1,-3,4,-1,2,1,-5,4],
//输出: 6
//解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
// 
//
// 进阶: 
//
// 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。 
// Related Topics 数组 分治算法 动态规划


package leetcode.editor.cn;
//Java：最大子序和
public class P53MaximumSubarray{
    public static void main(String[] args) {
        Solution solution = new P53MaximumSubarray().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    //方法一：动态规划思想 todo。。。
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];
        int res = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int mid = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                mid += nums[j];
                if (res < mid) res = mid;
            }
        }
        return res > nums[nums.length-1] ? res : nums[nums.length-1];
    }



}
//leetcode submit region end(Prohibit modification and deletion)

}