package Easy;

import java.util.Arrays;

public class DefuseTheBomb {

    public int[] decrypt(int[] code, int k) {
        int length = code.length;

        int[] result = new int[length];

        if(k > 0) {
            for(int mainPointer = 0; mainPointer < length; mainPointer++) {
                int sum = 0;
                int fastIndex = mainPointer + 1;

                for(int count = 0; count < k; count++) {
                    sum += code[fastIndex % length];
                    fastIndex++;
                }
                result[mainPointer] = sum;
            }
        }

        if(k < 0) {
            for(int mainPointer = 0; mainPointer < length; mainPointer++) {
                int sum = 0;
                int fastIndex = mainPointer - 1;

                for(int count = 0; count < Math.abs(k); count++) {
                    if(fastIndex < 0) {
                        fastIndex = length - 1;
                    }
                    sum += code[fastIndex];
                    fastIndex--;
                }
                result[mainPointer] = sum;
            }
        }

        if (k == 0) {
            Arrays.fill(result, 0);
        }

        return result;
    }
}
