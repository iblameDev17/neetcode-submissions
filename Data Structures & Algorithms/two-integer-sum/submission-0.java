class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> dev =new HashMap<>();
        int i=0;
        for(i=0; i<nums.length; i++)
        {
                int find= target- nums[i];
                if(dev.containsKey(find))
                {
                    return new int[] {dev.get(find),i};
                }
                else{
                 dev.put(nums[i],i);
                }
        }
        return new int[]{};
    }
}
