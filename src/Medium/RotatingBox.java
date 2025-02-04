package Medium;

public class RotatingBox {

    public char[][] rotateTheBox(char[][] boxGrid) {
        for(int i = 0; i < boxGrid.length; i++) {
            int emptyPosition = boxGrid[0].length - 1;

            for(int j = boxGrid[0].length - 1; j >= 0; j--) {
                if(boxGrid[i][j] == '.') {
                    if(emptyPosition == -1) {
                        emptyPosition = j;
                    }
                }
                else if(boxGrid[i][j] == '*') {
                    emptyPosition = -1;
                }
                else if(boxGrid[i][j] == '#' && emptyPosition != -1) {
                    boxGrid[i][j] = '.';
                    boxGrid[i][emptyPosition] = '#';
                    emptyPosition--;
                }
            }
        }

        int row = boxGrid.length;
        int col = boxGrid[0].length;

        char[][] rotatedMatrix = new char[col][row];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                rotatedMatrix[j][row - 1 - i] = boxGrid[i][j];
            }
        }

        return rotatedMatrix;
    }

}

