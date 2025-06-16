public class leetcode26 {
        public static int removeDuplicates(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }
    
            int i = 0; // pointer for the new array
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] != nums[i]) {
                    i++;
                    nums[i] = nums[j]; // overwrite duplicates
                }
            }
            return i + 1; // new length without duplicates
        }
    
        public static void main(String[] args) {
            int[] nums = {1, 2, 4, 4, 5};
            int newLength = removeDuplicates(nums);
    
            System.out.println("New length: " + newLength);
    
            System.out.print("Original array contents: ");
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums[j] + " ");
            }
            System.out.println();
    
            System.out.print("Modified array (no duplicates): ");
            for (int i = 0; i < newLength; i++) {
                System.out.print(nums[i] + " ");
            }
        }
    }
    

