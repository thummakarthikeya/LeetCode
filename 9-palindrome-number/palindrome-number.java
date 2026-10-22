class Solution {
    public boolean isPalindrome(int x) {
        int store = x;
        int last = 0;
        int num = 0;
        if(x<0){
            return false;
        }

        while(x != 0){
            last = x%10;

            num = num*10+last;

            x = x/10;
        }

        if(store == num){
            return true;
        }else{
            return false;
        }
        
    }
}