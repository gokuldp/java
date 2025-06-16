public class leetcode35 { public int searchInsert(int[] nums, int target) {
    int left = 0, right = nums.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    return left; // Insertion point
}

public static void main(String[] args) {
    leetcode35 sip = new leetcode35();

    System.out.println(sip.searchInsert(new int[]{1, 3, 5, 6}, 5)); // Output: 2
    System.out.println(sip.searchInsert(new int[]{1, 3, 5, 6}, 2)); // Output: 1
    System.out.println(sip.searchInsert(new int[]{1, 3, 5, 6}, 7)); // Output: 4
}
}
