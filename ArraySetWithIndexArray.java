public class ArraySetWithIndexArray {
    static public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];

        for (int i = 0; i < nums.length; ++i) {
            if (index[i] == i) {
                target[index[i]] = nums[i];
                System.out.print("nums   ->");
                for (int ele : nums) {
                    System.out.print(ele + " ");
                }
                System.out.println();
                System.out.print("target ->");
                for (int ele : target) {
                    System.out.print(ele + " ");
                }
                System.out.println();
            } else {
                int temp;
                for (int j = index[i]; j < i + 1; j++) {
                    temp = target[j];
                    target[j] = nums[i];
                    nums[i] = temp;
                    System.out.print("nums   ->");
                    for (int ele : nums) {
                        System.out.print(ele + " ");
                    }
                    System.out.println();
                    System.out.print("target ->");
                    for (int ele : target) {
                        System.out.print(ele + " ");
                    }
                    System.out.println();
                }
            }
        }

        return target;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };
        for (int i : createTargetArray(nums, index)) {
            System.out.println(i);
        }
    }
}
