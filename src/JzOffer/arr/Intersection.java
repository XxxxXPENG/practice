package JzOffer.arr;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Intersection {
    /**
     * 2数交集
     * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
     * 输出：[9,4]
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }
        return getIntersection(set1,set2);
    }

    private int[] getIntersection(Set<Integer> set1, Set<Integer> set2) {
        if (set1.size() > set2.size()) {
            return getIntersection(set2, set1);
        }
        Set<Integer> set = new HashSet<>();
        set1.forEach(num -> {
            if(set2.contains(num)){
                set.add(num);
            }
        });
        int[] res = new int[set.size()];
        int index = 0;
        for (Integer num : set) {
            res[index++] = num;
        }
        return res;
    }

    public int[] intersection1(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] res = new int[len1 + len2];
        int index = 0;
        for (int i = 0, j = 0; i < len1 && j < len2; ) {
            if (nums1[i] > nums2[j]) {
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                // 保证加入元素的唯一性
                if (index == 0 || nums1[i] != res[index - 1]) {
                    res[index++] = nums1[i];
                }
                res[index++] = nums1[i];
                i++;
                j++;
            }
        }
        return res;
    }
}
