package problem.integer;

import java.util.HashSet;
import java.util.Set;

class SolutionSingleNumber {

    public int singleNumberWithOutSpaceConstant(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        if(nums.length == 1) {
            return nums[0];
        }
        for(int i = 0; i < nums.length; i++) {
            if (numbers.contains(nums[i])) {
                numbers.remove(nums[i]);
            } else {
                numbers.add(nums[i]);
            }
        }

        return numbers.iterator().next();
    }

    public int singleNumberWithSpaceConstant(int[] nums) {
        int ans = nums[0];
        for(int i = 1; i< nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }

}

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums1 = {2,2,1};
        int[] nums2= {4,2,1,2,1};
        SolutionSingleNumber solutionSingleNumber = new SolutionSingleNumber();
        System.out.println(solutionSingleNumber.singleNumberWithOutSpaceConstant(nums1));
        System.out.println(solutionSingleNumber.singleNumberWithOutSpaceConstant(nums2));

        System.out.println(solutionSingleNumber.singleNumberWithSpaceConstant(nums1));
        System.out.println(solutionSingleNumber.singleNumberWithSpaceConstant(nums2));

    }
}
