package Medium;



public class MaximumBinaryTree {



    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return buildTree(nums, 0, nums.length - 1);
    }


    private TreeNode buildTree(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int[] valueAndIndexMaxes = findMaxValue(nums);
        int maxValue = valueAndIndexMaxes[0];
        int maxIndex = valueAndIndexMaxes[1];

        TreeNode root = new TreeNode(maxValue);
        root.left = buildTree(divideArray(nums, 0, maxIndex - 1), 0, maxIndex - 1);
        root.right = buildTree(
                divideArray(nums, maxIndex + 1, nums.length - 1),
                maxIndex + 1, nums.length - 1);


        return root;
    }


    private int[] divideArray(int[] nums, int from, int to) {
        if(from > to) {
            return new int[0];
        }

        int[] newArray = new int[to - from + 1];

        System.arraycopy(nums, from, newArray, 0, to - from + 1);

        return newArray;
    }


    private static int[] findMaxValue(int[] nums) {
        int[] output = new int[2];
        int maxValue = Integer.MIN_VALUE;
        int maxIndex = -1;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > maxValue) {
                maxValue = nums[i];
                maxIndex = i;
            }
        }

        output[0] = maxValue;
        output[1] = maxIndex;

        return output;
    }
}
