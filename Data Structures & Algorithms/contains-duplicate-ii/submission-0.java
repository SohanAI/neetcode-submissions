class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i = 0;
        int j = 1;

        while (i < nums.length - 1) {
            if (nums[i] == nums[j] && j - i <= k) {
                return true;
            }

            j++;

            if (j == nums.length) {
                i++;
                j = i + 1;
            }
        }

        return false;
    }


   
}