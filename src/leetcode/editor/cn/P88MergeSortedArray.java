//给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。 
//
// 说明: 
//
// 
// 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。 
// 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。 
// 
//
// 示例: 
//
// 输入:
//nums1 = [1,2,3,0,0,0], m = 3
//nums2 = [2,5,6],       n = 3
//
//输出: [1,2,2,3,5,6] 
// Related Topics 数组 双指针


package leetcode.editor.cn;
//Java：合并两个有序数组
public class P88MergeSortedArray{
    public static void main(String[] args) {
        Solution solution = new P88MergeSortedArray().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    //方法一：双指针（从前往后）
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int[] copy = new int[m];
//        System.arraycopy(nums1, 0, copy, 0, m);
//        int i = 0, j = 0, p = 0;
//        while (i < m && j < n) {
//            nums1[p++] = (copy[i] < nums2[j]) ? copy[i++] : nums2[j++];
//        }
//        if (i < m) System.arraycopy(copy,i,nums1,i+j,m+n-i-j);
//        if (j < n) System.arraycopy(nums2,j,nums1,i+j,m+n-i-j);
//    }

    //方法二：双指针（从后往前）
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1, p = m + n - 1;
        while (p1 >= 0 && p2 >= 0) {
            nums1[p--] = nums1[p1] < nums2[p2] ? nums2[p2--] : nums1[p1--];
        }
        //这里不需要判断，只需要拼接nums2即可，应为如果余下的是nums1则不需要拼接
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }



}
//leetcode submit region end(Prohibit modification and deletion)

}