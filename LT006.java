public class LT006{
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int k = 1;  
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { 
                nums[k] = nums[i];  
                k++;  
            }
        }
        
        return k;  
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        
        int[] nums1 = {1, 1, 2};
        int k1 = solution.removeDuplicates(nums1);
        System.out.println("Test Case 1:");
        System.out.println("Number of unique elements: " + k1);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println("\n");

        
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = solution.removeDuplicates(nums2);
        System.out.println("Test Case 2:");
        System.out.println("Number of unique elements: " + k2);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println("\n");
    }
}
