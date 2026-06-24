class Solution {
    public int[] plusOne(int[] digits) {
        
        String str = "";
        int result[] = new int[digits.length+1];
        int last  = result.length;
        for(int i= digits.length-1; i>=0; i--){
            if(digits[i]< 9){
                digits[i] += 1;
                return digits;
            }

                digits[i] = 0;

        }
         result[0] = 1;

        return result;
       
    }
}