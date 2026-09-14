
public class Twosum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }

        }
        return new int[] { -1, -1 }; // Return an invalid index pair if no solution is found
    }

    public static void main(String[] args) {
        Twosum solution = new Twosum();
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int result[] = solution.twoSum(nums, target);
        System.out.println("Indices of the two numbers that add up to the target: " + result[0] + ", " + result[1]);

    }
}
