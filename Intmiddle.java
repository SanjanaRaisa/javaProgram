public class Intmiddle {

    public int a;
    public int b;
    public int c;

    public int middle() {

        int[] nums = {a, b, c};
        int temp;

        for (int i = 0; i < 3; i++) {
            for (int j = i; j < 3; j++) {

                if (nums[j] < nums[i]) {

                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums[1];
    }
}