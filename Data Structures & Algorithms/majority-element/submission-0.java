class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (seen.containsKey(nums[i])) {
                seen.put(nums[i], seen.get(nums[i]) + 1);
            } else {

                seen.put(nums[i], 1);

            }

            if (seen.get(nums[i]) > nums.length / 2) {
                return nums[i];
            }
 
        }

        return -1;

        

    }
}