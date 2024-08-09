public class Main {
    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 9) {
                count++;
            }
        }
        return count;
    }

//    public static void main(String[] args) {
//        Solution sol = new Solution();
//        System.out.println(sol.arrayCount9(new int[]{1, 2, 9}));
//        System.out.println(sol.arrayCount9(new int[]{1, 9, 9}));
//        System.out.println(sol.arrayCount9(new int[]{1, 9, 9, 3, 9}));
//    }
//public static void main(String[] args) {
//    System.out.println(arrayCount9(new int[]{1, 2, 9}));
//    System.out.println(arrayCount9(new int[]{1, 9, 9}));
//    System.out.println(arrayCount9(new int[]{1, 9, 9, 3, 9}));
//}
    public static void main(String[] args) {
        Main main = new Main();
    System.out.println(main.arrayCount9(new int[]{1, 2, 9}));
    System.out.println(main.arrayCount9(new int[]{1, 9, 9}));
    System.out.println(main.arrayCount9(new int[]{1, 9, 9, 3, 9}));

        System.out.println("This Practical is made by 23CS054 Hitansh Parikh");

    }
}