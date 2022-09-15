class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i=0,j=0;
        int ans=0;
        int p=1;
        while(j<nums.length){
            p*=nums[j];
            while(i<nums.length && p>=k){
                p/=nums[i];
                i++;
                if(i>=nums.length)return ans;
            }
            ans+=j-i+1;
            j++;
        }
        return ans;
    }
}