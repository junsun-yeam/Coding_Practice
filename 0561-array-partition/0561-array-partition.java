class Solution {
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        List<Integer> numList = new ArrayList<>();
        Arrays.sort(nums);

        for(int i : nums) {
            numList.add(i);
            if(numList.size() == 2) {
                sum += Collections.min(numList);
                numList.clear();
            }
        }

        return sum;
    }
}