package leetcode;


public class MissingNumber {
    public static void main(String[] args) {

    }

    public static int missingNumber(int[] nums) {

        //series of numbers math formula
        int arrTotal = (nums.length * (nums.length + 1)) / 2;
        int sum = 0;

        for (int num:nums){
            sum += num;
        }

        return arrTotal - sum;
    }


}
