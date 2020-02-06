//斐波那契数，通常用 F(n) 表示，形成的序列称为斐波那契数列。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是： 
//
// F(0) = 0,   F(1) = 1
//F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
// 
//
// 给定 N，计算 F(N)。 
//
// 
//
// 示例 1： 
//
// 输入：2
//输出：1
//解释：F(2) = F(1) + F(0) = 1 + 0 = 1.
// 
//
// 示例 2： 
//
// 输入：3
//输出：2
//解释：F(3) = F(2) + F(1) = 1 + 1 = 2.
// 
//
// 示例 3： 
//
// 输入：4
//输出：3
//解释：F(4) = F(3) + F(2) = 2 + 1 = 3.
// 
//
// 
//
// 提示： 
//
// 
// 0 ≤ N ≤ 30 
// 
// Related Topics 数组


package leetcode.editor.cn;
//Java：斐波那契数
public class P509FibonacciNumber{
    public static void main(String[] args) {
        Solution solution = new P509FibonacciNumber().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    //方法一： 动态规划
//    public int fib(int N) {
//        if (N == 0) return 0;
//        int[] fb = new int[N+1];
//        fb[0] = 0;
//        fb[1] = 1;
//        for (int i = 2; i <= N; i++) {
//            fb[i] = fb[i-1] +fb[i-2];
//        }
//        return fb[N];
//    }

//    public int fib(int N) {
//        if (N == 0) return 0;
//        int[] fb = new int[N+1];
//        fb[0] = 0;
//        fb[1] = 1;
//        for (int i = 2; i <= N; i++) {
//            fb[i] = fb[i-1] + fb[i-2];
//        }
//        return fb[N];
//    }

    //递归法(不推荐):可以将计算的中间结果进行cache
//    public int fib(int N) {
//        if (N <= 1) return N;
//        return fib(N-1) + fib(N-2);
//    }


    //方法二： 优化动态规划
    public int fib(int N) {
        if (N <= 1) return N;
        int pre = 0, cur = 1;
        for (int i = 2; i <= N; i++) {
            int next = pre +cur;
            pre = cur;
            cur = next;
        }
        return cur;
    }






}
//leetcode submit region end(Prohibit modification and deletion)














}