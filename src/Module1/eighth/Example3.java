package Module1.eighth;

public class Example3 {
    public static void main(String[] args) {
//        int x = 5;
//        System.out.println("Before calling changeValue method: x = " + x);
//        changeValue(x);
//        System.out.println("After calling changeValue method: x = " + x);

        int[] nums = {1, 2, 3, 4, 5};
        System.out.println("Before calling changeArray method: nums[0] = " + nums[0]);
        changeArray(nums);
        System.out.println("After calling changeArray method: nums[0] = " + nums[0]);
    }

    public static void changeValue(int num) {
        System.out.println("what the value we recieved"+num);
        num = 100;
    }

    public static void changeArray(int[] arr) {
        arr[0] = 10;
    }
}

