package JzOffer.arr;

import java.util.Arrays;

/**
 * 给定一个整数数组 A，如果它是有效的山脉数组就返回 true，否则返回 false。
 * <p>
 * 让我们回顾一下，如果 A 满足下述条件，那么它是一个山脉数组：
 * <p>
 * A.length >= 3
 * 在 0 < i < A.length - 1 条件下，存在 i 使得：
 * A[0] < A[1] < ... A[i-1] < A[i]
 * A[i] > A[i+1] > ... > A[A.length - 1]
 */
public class ValidMountainArray {
    /*
    //不能保证递减
    public static boolean validMountainArray(int[] A) {
        return A.length >= 3 && isMountain(A);
    }

    public static boolean isMountain(int[] A) {
        int maxIndex = getMaxIndex(A);
        for (int i = 0, j = A.length - 1; i < maxIndex && j > maxIndex; ) {
            if (A[i] < A[maxIndex]) {
                i++;
            }  if (A[j] > A[maxIndex]) {
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static int getMaxIndex(int[] A) {
        int max = Integer.MIN_VALUE;
        for (int num : A) {
            max = num > max ? num : max;
        }
        for (int i = 0; i < A.length; i++) {
            if(A[i] == max)
                return i;
        }
        return 0;
    }*/

    public static boolean validMountainArray(int[] A) {
        int len = A.length;
        int i = 0;
        //扫描递增
        while (i + 1 < len && A[i] < A[i + 1]) {
            i++;
        }
        //最高点不能为首尾
        if (i == 0 || i == len - 1) {
            return false;
        }
        //扫描递减
        while (i + 1 < len && A[i] > A[i + 1]) {
            i++;
        }
        return i == len - 1;
    }

    public static void main(String[] args) {
        int[] A = {3, 5, 5};
        System.out.println(validMountainArray(A));
    }
}
