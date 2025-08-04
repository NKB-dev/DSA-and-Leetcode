class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        
        if(timeSeries.length == 0){
            return 0;
        }
        int t =0;

        for(int i =0; i<timeSeries.length-1;i++){
            t += Math.min(timeSeries[i+1]-timeSeries[i],duration);
        }
        return t+duration;
        
    
    }
}