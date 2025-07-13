class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);    // Sort players by ability
        Arrays.sort(trainers);   // Sort trainers by capacity
        
        int i = 0, j = 0;        // i for players, j for trainers
        int n = players.length;
        int m = trainers.length;
        int count = 0;          // Count of valid matches

        // Two-pointer approach
        while (i < n && j < m) {
            if (players[i] <= trainers[j]) {
                // Player i can match with trainer j
                i++;
                j++;
                count++;
            } else {
                // Player i can't match with trainer j, try next trainer
                j++;
            }
        }
        
        return count;
    }
}
