public class Main {

    // Input: nums = [1,1,1,2,2,3]
    // Output: 5, nums = [1,1,2,2,3,_]
    // Explanation: Your function should return k = 5, with the first five elements of nums
    // being 1, 1, 2, 2 and 3 respectively.
    // It does not matter what you leave beyond the returned k (hence they are underscores).
    public static int removeDuplicates(int[] nums) {
        int k = 1;
        int count = 0;

        for (int i = 1; i < nums.length; i++) {

            // if the current number is equal to the previous number
            // increase the count
            if (nums[i] == nums[i - 1]) {
                count++;

                // if the current number is not equal to the previous number
                // rest the count to 0
            } else {
                count = 0;
            }

            // stores 2 times the value of nums[i]
            // when the current number is equal to the previous number the count is 1 the if statement will run
            // if this continues the count will be > 2 so the if statement will not run
            // when count is 0 it means that the current number is not equal to the previous number
            // so the if statement runs to store that value
            if (count < 2) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }


    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};

        System.out.println(removeDuplicates(nums));
    }
}