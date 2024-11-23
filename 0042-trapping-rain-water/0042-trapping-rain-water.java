public class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        // Initialize two pointers, one at the beginning and one at the end of the array
        int left = 0;
        int right = height.length - 1;

        // Initialize the maximum height on the left and right sides
        int maxLeft = height[left];
        int maxRight = height[right];

        // Initialize the total amount of water that can be trapped
        int totalWater = 0;

        // Move the pointers towards each other
        while (left < right) {
            // If the height on the left side is less than the height on the right side,
            // move the left pointer to the right
            if (height[left] < height[right]) {
                // If the height on the left side is greater than the maximum height on the left side,
                // update the maximum height on the left side
                if (height[left] > maxLeft) {
                    maxLeft = height[left];
                } else {
                    // Otherwise, add the difference between the maximum height on the left side
                    // and the height on the left side to the total amount of water
                    totalWater += maxLeft - height[left];
                }
                // Move the left pointer to the right
                left++;
            } else {
                // If the height on the right side is greater than the maximum height on the right side,
                // update the maximum height on the right side
                if (height[right] > maxRight) {
                    maxRight = height[right];
                } else {
                    // Otherwise, add the difference between the maximum height on the right side
                    // and the height on the right side to the total amount of water
                    totalWater += maxRight - height[right];
                }
                // Move the right pointer to the left
                right--;
            }
        }

        // Return the total amount of water that can be trapped
        return totalWater;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(solution.trap(height)); // Output: 6

        height = new int[] {4, 2, 0, 3, 2, 5};
        System.out.println(solution.trap(height)); // Output: 9
    }
}
