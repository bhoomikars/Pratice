class Solution {
    public int climbStairs(int n) {
        int[] ways = new int[n];
        
        for(int i=0; i<n; i++) {
            if(i == 0){
                ways[0] = 1;
            }
            else if(i == 1){
                ways[1] = 2;
            }
            else {
                ways[i] = ways[i-1] + ways[i-2];
            }
        }
        
        return ways[n-1];
      
    
}
}
