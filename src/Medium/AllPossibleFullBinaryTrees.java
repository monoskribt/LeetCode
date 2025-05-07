package Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllPossibleFullBinaryTrees {

    private static final Map<Integer , List<TreeNode>> map = new HashMap<>();

    public static List<TreeNode> allPossibleFBT(int n) {
        if(!map.containsKey(n)){
            List<TreeNode> res = new ArrayList<>();

            if(n == 1){
                res.add(new TreeNode(0,null,null));
            } else {
                for(int i = 1 ; i < n ; i += 2){
                    List<TreeNode> leftSubtree = allPossibleFBT(i);
                    List<TreeNode> rightSubtree = allPossibleFBT(n - i - 1);

                    for(TreeNode left : leftSubtree){
                        for(TreeNode right : rightSubtree){
                            res.add(new TreeNode(0,left,right));
                        }
                    }
                }
            }
            map.put(n , res);
        }

        return map.get(n);
    }

    public static void main(String[] args) {
        List<TreeNode> result = allPossibleFBT(7);
        System.out.println(result);
    }
}
