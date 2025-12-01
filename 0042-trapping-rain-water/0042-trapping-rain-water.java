class Solution {
    public int trap(int[] height) {
        //필요한 변수 선언(빗뭇의 양, 왼쪽 x축, 오른쪽 x축, 왼쪽 최대 y축, 오른쪽 최대 y축)
        int volume = 0;
        int left = 0;
        int right = height.length - 1;
        int leftMax = height[left];
        int rightMax = height[right];

        while(left < right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);

            if(leftMax < rightMax) {
                volume = volume + leftMax - height[left];
                left ++;
            } else {
                volume = volume + rightMax - height[right];
                right --;
            }
        }
        return volume;

    }
}