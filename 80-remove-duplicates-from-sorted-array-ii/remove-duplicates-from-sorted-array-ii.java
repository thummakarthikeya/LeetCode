class Solution {
    public int removeDuplicates(int[] nums) {
        int result = 2;

        for (int i=2; i<nums.length; i++) {
            if (nums[result-2]  != nums[i]) {
                nums[result] = nums[i];
                result++;
            }
        }

        return result;
    }
}


// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int result = 0;

//         for (int i = 0; i < nums.length; i++) {
//             int count = 1;

//             for (int j = i + 2; j < nums.length; j++) {
//                 if (nums[i] == nums[j] && nums[i] != -1) {
//                     count++;
//                     nums[j] = -1;
//                 }
//             }
//             if (count > 0 && nums[i] != -1) {
//                 // result = result * 10 + nums[i];
//                 result++;
//             }
//         }
//         return result;
//     }
// }
