package Easy;

public class ConvertDateToBinary {

    public String convertDateToBinary(String date) {
        StringBuilder result = new StringBuilder();
        String[] word = date.split("-");

        for(int i = 0; i < word.length; i++) {
            int toBinary = Integer.parseInt(word[i]);
            result.append(Integer.toBinaryString(toBinary));
            if(i != word.length - 1) {
                result.append("-");
            }
        }

        return result.toString();
    }
}
