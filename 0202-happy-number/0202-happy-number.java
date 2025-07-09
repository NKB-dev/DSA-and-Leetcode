class Solution {
    public boolean isHappy(int n) {
        while(n!=1 && n!=4){
            int s =0;
            while(n!=0){
                int p = (n%10) * (n%10);
                s+=p;
                n=n/10;
            }
            n = s;
        }

        if(n==1){
        return true;
        }
        else{
        return false;
        }
        
    }
}