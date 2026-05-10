import java.util.*;

class Solution {

    public int largestRectangleArea(int[] heights) {

        int ns[] = findNextSmaller(heights);
        int ps[] = findPrevSmaller(heights);

        int max = 0;

        for (int i = 0; i < heights.length; i++) {

            int h = heights[i];

            int w = ns[i] - ps[i] - 1;

            max = Math.max(max, h * w);
        }

        return max;
    }

    public static int[] findPrevSmaller(int arr[]) {

        int n = arr.length;

        Stack<Integer> stack = new Stack<>();

        int res[] = new int[n];

        // LEFT TO RIGHT
        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }

            stack.push(i);
        }

        return res;
    }

    public static int[] findNextSmaller(int arr[]) {

        int n = arr.length;

        Stack<Integer> stack = new Stack<>();

        int res[] = new int[n];

        // RIGHT TO LEFT
        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                res[i] = n;
            } else {
                res[i] = stack.peek();
            }

            stack.push(i);
        }

        return res;
    }
}