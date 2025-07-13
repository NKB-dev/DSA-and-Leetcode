class Solution {
    public int findLucky(int[] arr) {
        int l = 0;
        int ml =-1;
        for(int i =0; i <arr.length;i++){
            int count = 0;
            for(int j =0; j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(arr[i]==count){
                l=arr[i];
                if(ml<l){
                ml=l;
            }
            }
            
        }
        return ml;
        
    }
}