class Solution {
    public double myPow(double x, int n) {
        if(n>0){
            double l = x;
            for(double i =0;i<n-1;i++){
                x*=l;
            }
        }
        else if(n==0){
            return 1;
        }
        else{
            double m = x;
            x =1;
            for(int i = 0;i<-n;i++){
                x*=(1/m);
            }
        }

        return x;
    }
}
