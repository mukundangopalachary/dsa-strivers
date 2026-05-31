package com.strivers.stacks_n_queues.problems_i;

class TrappingRainWater {

  public int trap(int[] height) {
    int left = 0;
    int right = height.length - 1;
    int water = 0;
    int leftMax = height[left];
    int rightMax = height[right];

    while (left < right) {
      leftMax = Math.max(leftMax, height[left]);
      rightMax = Math.max(rightMax, height[right]);
      if (leftMax < rightMax) {
        water += leftMax - height[left++];
      } else {
        water += rightMax - height[right--];
      }
    }

    return water;
  }
}
