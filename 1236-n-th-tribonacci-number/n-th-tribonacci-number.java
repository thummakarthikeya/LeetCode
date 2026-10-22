class Solution {
    public int tribonacci(int n) {

        int first  = 0;
        int second = 1;
        int third = 1;

        if(n== 0){
            return 0;
        }else if(n==1 || n==2){
            return 1;
        }

        int res = 0;

        for(int i=1; i<=n; i++){
            res = first + second + third;
            first = second;
            second = third;
            third = res;
        }
        return first;


        
    }
}