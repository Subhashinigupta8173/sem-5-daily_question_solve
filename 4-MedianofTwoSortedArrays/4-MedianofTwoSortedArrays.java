// Last updated: 23/9/2025, 11:53:13 pm
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;
        int low = 0, high = m;

        while (low <= high) {
            int partition1 = (low + high) / 2;
            int partition2 = (m + n + 1) / 2 - partition1;

            // If partition1 is 0 it means nothing is there on left side. Use -INF for maxLeft
            int maxLeft1 = (partition1 == 0) ? Integer.MIN_VALUE : nums1[partition1 - 1];
            int minRight1 = (partition1 == m) ? Integer.MAX_VALUE : nums1[partition1];

            int maxLeft2 = (partition2 == 0) ? Integer.MIN_VALUE : nums2[partition2 - 1];
            int minRight2 = (partition2 == n) ? Integer.MAX_VALUE : nums2[partition2];

            // Check if we have found the correct partition
            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                // Odd total length
                if ((m + n) % 2 == 1) {
                    return Math.max(maxLeft1, maxLeft2);
                } else {
                    // Even total length
                    return (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;
                }
            } else if (maxLeft1 > minRight2) {
                // Move towards left in nums1
                high = partition1 - 1;
            } else {
                // Move towards right in nums1
                low = partition1 + 1;
            }
        }

        throw new IllegalArgumentException("Input arrays are not sorted.");
    }
}
