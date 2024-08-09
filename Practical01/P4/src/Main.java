public class Main {
    public static void main(String[] args) {
        int[][] array = new int[3][];

        array[0] = new int[]{1};
        array[1] = new int[]{1, 2};
        array[2] = new int[]{1, 2, 3};

        System.out.println("Length of first dimension: " + array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Length of array[" + i + "]: " + array[i].length);

            System.out.println("This Practical is made by 23CS054 Hitansh Parikh");

        }
    }
}