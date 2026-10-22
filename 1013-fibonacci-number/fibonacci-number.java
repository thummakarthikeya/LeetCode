class Solution {
    public int fib(int n) {
        int first = 0;
        int second  = 1;
        int res = 0;

    if(n == 1){
        return 1;
    }    
    

            for(int i=0; i<n-1; i++){

                res = first + second;
                first = second;
                second = res;

            }

            return res;
        



    }
}