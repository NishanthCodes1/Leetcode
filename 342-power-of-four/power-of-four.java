class Solution {
    public boolean isPowerOfFour(int n) {
        int a=n;
        if(n<=0){
            return false;
        }
        while(a%4==0){
            a=a/4;
        }
        return a==1;
    }
}