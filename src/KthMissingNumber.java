public class KthMissingNumber {


    public static int solve(int[] nums, int k){
        int m = nums[nums.length-1]-nums[0]- nums.length;
        if (k<=m){
            int count = -1;
            int index = 0;
            for (int i =0;i< nums.length;i++){
                if (nums[i]==nums[index]){
                    index++;
                }
                else {
                    count++;
                    if (count == k) {
                        return nums[i];
                    }
                }
            }
            return 0;
        }
        else {
            return nums[nums.length-1]-m+k;
        }
    }

    public static void main(String[] args) {

        int[] nums = {1,2,4};
        int k = 0;

        System.out.println(solve(nums,k));

    }
}
