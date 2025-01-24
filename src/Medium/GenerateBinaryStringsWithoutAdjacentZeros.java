package Medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateBinaryStringsWithoutAdjacentZeros {

    private List<String> resultLst;


    public List<String> validStrings(int n) {
        resultLst = new ArrayList<>();

        if(n == 0) {
            return resultLst;
        }

        helpGenerate("", n);

        return resultLst;
    }

    private void helpGenerate(String currentGenerate, int n) {
        int length = currentGenerate.length();

        if(length == n) {
            resultLst.add(currentGenerate);
            return;
        }

        if(currentGenerate.isEmpty()) {
            helpGenerate("0", n);
            helpGenerate("1", n);
            return;
        }


        char lastSymbol = currentGenerate.charAt(length - 1);

        if(lastSymbol == '1') {
            helpGenerate(currentGenerate + "0", n);
            helpGenerate(currentGenerate + "1", n);
        }

        if(lastSymbol == '0') {
            helpGenerate(currentGenerate + "1", n);
        }
    }




}
