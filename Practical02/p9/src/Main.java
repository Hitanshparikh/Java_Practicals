public class Main {
    public static boolean arrayFront9(int[] nums) {
        int end = Math.min(nums.length, 4);

        for (int i = 0; i < end; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(arrayFront9(new int[]{1, 2, 9, 3, 4}));
        System.out.println(arrayFront9(new int[]{1, 2, 3, 4, 9}));
        System.out.println(arrayFront9(new int[]{1, 2, 3, 4, 5}));

        System.out.println("This Practical is made by 23CS054 Hitansh Parikh");
    }
}