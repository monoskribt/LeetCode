package Medium;

import java.util.*;

public class ConvertAnArrayIntoA2DArrayWithConditions {

    public static List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> copyOfNumsList = new ArrayList<>();

        for(Integer el : nums) {
            copyOfNumsList.add(el);
        }

        while (!copyOfNumsList.isEmpty()) {

            List<Integer> uniqueElements = new ArrayList<>();

            for(int i = 0; i < copyOfNumsList.size(); i++) {
                if(!uniqueElements.contains(copyOfNumsList.get(i))) {
                    uniqueElements.add(copyOfNumsList.get(i));
                    copyOfNumsList.remove(i);
                    i = i-1;
                }
            }
            List<Integer> tempList = List.of(uniqueElements.toArray(new Integer[0]));
            resultList.add(tempList);
            uniqueElements.clear();
        }

        return resultList;
    }


    public static void main(String[] args) {
        int[] nums = {1,3,4,1,2,3,1};
        List<List<Integer>> result = findMatrix(nums);
        System.out.println(result);
    }

}
