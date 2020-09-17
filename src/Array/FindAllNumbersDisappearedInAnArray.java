package Array;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {

    private List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if (nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        FindAllNumbersDisappearedInAnArray f = new FindAllNumbersDisappearedInAnArray();
        int[] test = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(f.findDisappearedNumbers(test));
    }
}
