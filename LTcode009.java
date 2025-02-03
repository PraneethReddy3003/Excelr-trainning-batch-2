public class LTcode009{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        int m = nums1.length, n = nums2.length;
        int low = 0, high = m;

        while (low <= high) {
            int i = (low + high) / 2; 
            int j = (m + n + 1) / 2 - i;  

            if (i < m && nums2[j - 1] > nums1[i]) {
                low = i + 1;  
            } else if (i > 0 && nums1[i - 1] > nums2[j]) {
                high = i - 1;  
            } else {
                int maxOfLeft = 0;
                if (i == 0) {
                    maxOfLeft = nums2[j - 1];
                } else if (j == 0) {
                    maxOfLeft = nums1[i - 1];
                } else {
                    maxOfLeft = Math.max(nums1[i - 1], nums2[j - 1]);
                }

                if ((m + n) % 2 == 1) {
                    return maxOfLeft;
                }

                int minOfRight = 0;
                if (i == m) {
                    minOfRight = nums2[j];
                } else if (j == n) {
                    minOfRight = nums1[i];
                } else {
                    minOfRight = Math.min(nums1[i], nums2[j]);
                }

               
                return (maxOfLeft + minOfRight) / 2.0;
            }
        }

        return 0.0; 
    }

    public static void main(String[] args) {
        LTcode009 solution = new LTcode009();

        
        int[] nums1_1 = {1, 3};
        int[] nums2_1 = {2};
        System.out.println("Median of [1, 3] and [2]: " + solution.findMedianSortedArrays(nums1_1, nums2_1)); // Expected output: 2.0

        
        int[] nums1_2 = {1, 2};
        int[] nums2_2 = {3, 4};
        System.out.println("Median of [1, 2] and [3, 4]: " + solution.findMedianSortedArrays(nums1_2, nums2_2)); // Expected output: 2.5

        
        int[] nums1_3 = {0};
        int[] nums2_3 = {0};
        System.out.println("Median of [0] and [0]: " + solution.findMedianSortedArrays(nums1_3, nums2_3)); // Expected output: 0.0

       
        int[] nums1_4 = {1, 3, 8};
        int[] nums2_4 = {7, 9, 10, 11};
        System.out.println("Median of [1, 3, 8] and [7, 9, 10, 11]: " + solution.findMedianSortedArrays(nums1_4, nums2_4)); // Expected output: 8.0
    }
}
