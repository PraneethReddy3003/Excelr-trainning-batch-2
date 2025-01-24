import java.util.HashMap;

public class LT005{

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            
            numMap.put(nums[i], i);
        }
        
        return new int[] {}; // In case no solution is found (though the problem guarantees a solution)
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Test case 1: Indices for target " + target1 + " -> [" + result1[0] + ", " + result1[1] + "]");
        
        // Test case 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("Test case 2: Indices for target " + target2 + " -> [" + result2[0] + ", " + result2[1] + "]");
        
        
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        System.out.println("Test case 3: Indices for target " + target3 + " -> [" + result3[0] + ", " + result3[1] + "]");
        
        
        int[] nums4 = {-1, 5, -2, 3, 7};
        int target4 = 5;
        int[] result4 = solution.twoSum(nums4, target4);
        System.out.println("Test case 4: Indices for target " + target4 + " -> [" + result4[0] + ", " + result4[1] + "]");
        
        
        int[] nums5 = {1000000000, 2000000000, -1000000000};
        int target5 = 1000000000;
        int[] result5 = solution.twoSum(nums5, target5);
        System.out.println("Test case 5: Indices for target " + target5 + " -> [" + result5[0] + ", " + result5[1] + "]");
    }
}
