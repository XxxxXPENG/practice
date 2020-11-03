package JzOffer.arr;

import java.util.ArrayList;
import java.util.List;

public class ThreeSumClosest {
    /**
     * 输入：nums = [-1,2,1,-4], target = 1
     * 输出：2
     * 解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
     *
     * 思路：  3个数之和 靠近 target
     *  1.  找出一个数等于(最接近)target,另外2个加起来为零
     */
    public static int threeSumClosest(int[] nums, int target) {
        int mid = 0;
        List<Integer> list = new ArrayList<>();
        //找出中间那个数 (最接近target的数)
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
            mid = target - nums[i] < mid ? nums[i] : mid;
        }
        list.remove(Integer.valueOf(mid));
        System.out.println(list);
        //最接近0的两个数
        int gap = list.get(0) + list.get(1);
        for (int i = 0; i < list.size();i++ ) {
            for(int j = i+1; j < list.size();j++){
               gap = Math.abs(list.get(i) + list.get(j))  < gap ? list.get(i) + list.get(j) : gap;
            }
        }
        System.out.println("gap = " + gap + " , mid = " + mid);
        return gap + mid;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,-1};
        System.out.println(threeSumClosest(arr,2));
    }
}
