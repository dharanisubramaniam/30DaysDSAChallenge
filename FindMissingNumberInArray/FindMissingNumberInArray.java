class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int totalSum=0;
        int currentSum=0;
        totalSum=n*(n+1)/2;
        for(int i:nums){
        currentSum+=i;
        }
        return totalSum-currentSum;
    }
}