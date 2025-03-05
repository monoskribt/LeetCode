package Easy;

public class FindTheNumberOfGoodPairsI {

    public static int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int countOfPair = 0;

        for(int i = 0; i < nums1.length; i++) {
            int mainElement = nums1[i];

            for(int j = 0; j < nums2.length; j++) {
                if(mainElement % (nums2[j] * k) == 0) {
                    countOfPair++;
                }
            }
        }

        return countOfPair;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[] {1,2,4,12};
        int[] nums2 = new int[] {2,4};

        int result = numberOfPairs(nums1, nums2, 3);
        System.out.println(result);
    }

}
