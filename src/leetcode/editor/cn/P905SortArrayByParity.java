//给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素。 
//
// 你可以返回满足此条件的任何数组作为答案。 
//
// 
//
// 示例： 
//
// 输入：[3,1,2,4]
//输出：[2,4,3,1]
//输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= A.length <= 5000 
// 0 <= A[i] <= 5000 
// 
// Related Topics 数组


package leetcode.editor.cn;
//Java：按奇偶排序数组
public class P905SortArrayByParity{
    public static void main(String[] args) {
//        Solution solution = new P905SortArrayByParity().new Solution();
        // TO TEST
        System.out.println(1%2);
        System.out.println(3%2);
        System.out.println(2%2);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    //双指针思想，待优化
//    public int[] sortArrayByParity(int[] A) {
//        int j = 0, y = A.length-1;
//        for (int i = 0; i < A.length; i++) {
//            if (A[i] % 2 == 0) {
//                int tmp = A[j];
//                A[j] = A[i];
//                A[i] = tmp;
//                j++;
//            }
//        }
//        return A;
//    }

    //双指针优化版
//    public int[] sortArrayByParity(int[] A) {
//        int j = 0, y = A.length-1;
//        while (j < y) {
//            if (A[j] % 2 != 0 && A[y] % 2 == 0) {
//                int tmp = A[j];
//                A[j] = A[y];
//                A[y] = tmp;
//            }
//            if (A[j] % 2 == 0) j++;
//            if (A[y] % 2 != 0) y--;
//        }
//        return A;
//    }


    //复习
//    public int[] sortArrayByParity(int[] A) {
//        int m = 0, n = A.length-1;
//        for ( ; m < n; ) {
//            if (A[m] % 2 == 1 && A[n] % 2 == 0) {
//                int tmp = A[m];
//                A[m] = A[n];
//                A[n] = tmp;
//            }
//            if (A[m] % 2 == 0) m++;
//            if (A[n] % 2 == 1) n--;
//        }
//        return A;
//    }

    //复习2
    public int[] sortArrayByParity(int[] A) {
        int m = 0, n = A.length-1;
        while (m < n) {
            if (A[m] % 2 ==1 && A[n] % 2 == 0) {
                int tmp = A[m];
                A[m] = A[n];
                A[n] = tmp;
            }
            if (A[m] % 2 == 0) m++;
            if (A[n] % 2 == 1) n--;
        }
        return A;
    }


}
//leetcode submit region end(Prohibit modification and deletion)












}