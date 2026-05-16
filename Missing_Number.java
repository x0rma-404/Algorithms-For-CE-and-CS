void main(){
    int[] nums1 = {9,6,4,2,3,5,7,0,1};
    Arrays.sort(nums1);
    int[] nums = java.util.Arrays.copyOf(nums1, nums1.length + 1);
    nums[nums.length - 1] = 0;
    IO.println(Arrays.toString(nums));

    for (int i = 0; i < nums.length; i++) {
        if (i!=nums[i]) {
            IO.println(i);
            break;
        }
    }

}