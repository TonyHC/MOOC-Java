import java.util.ArrayList;
import java.util.List;

public class AnotherMagicSquare {
    private int[][] magicSquare;
    private int size;

    public AnotherMagicSquare() {
        this.createMagicSquare(size);
    }

    public List<Integer> sumsOfRows() {
        List<Integer> rowSum = new ArrayList<>();
        int sumOfRow = 0;

        for (int row = 0; row < this.magicSquare.length; row++) {
            for (int col = 0; col < this.magicSquare[row].length; col++) {
                sumOfRow += this.magicSquare[row][col];
            }

            rowSum.add(sumOfRow);
            sumOfRow = 0;
        }

        return rowSum;
    }

    public List<Integer> sumsOfColumns() {
        List<Integer> columnSum = new ArrayList<>();
        int sumOfCol = 0;

        for (int row = 0; row < this.magicSquare.length; row++) {
            for (int col = 0; col < this.magicSquare[row].length; col++) {
                sumOfCol += this.magicSquare[col][row];
            }

            columnSum.add(sumOfCol);
            sumOfCol = 0;
        }

        return columnSum;
    }

    public List<Integer> sumsOfDiagonals() {
        List<Integer> diagonalSum = new ArrayList<>();
        int sumOfLeftDiagonal = 0;
        int sumOfRightDiagonal = 0;

        for (int row = 0; row < this.magicSquare.length; row++) {
            for (int col = 0; col < this.magicSquare[row].length; col++) {
                if (row == col) {
                    sumOfLeftDiagonal += this.magicSquare[row][col];
                }

                if (col == this.magicSquare[row].length - (col + 1)) {
                    sumOfRightDiagonal += this.magicSquare[row][col];
                }
            }
        }

        diagonalSum.add(sumOfLeftDiagonal);
        diagonalSum.add(sumOfRightDiagonal);

        return diagonalSum;
    }

    public int[][] createMagicSquare(int size) {
        if (size % 2 != 0) {
            this.size = size;
            this.magicSquare = new int[size][size];
            populateArray();
        }

        return this.magicSquare;
    }

    private void populateArray() {
        /*
        int row = size - 1;
        int col = size / 2;

        this.magicSquare[row][col] = 1;

        for(int i = 2; i <= size * size; i++) {
            if(this.magicSquare[(row + 1) % size][(col + 1) % size] == 0) {
                row = (row + 1) % size;
                col = (col + 1) % size;
            } else {
                row = (row - 1 + size) % size;
            }

            this.magicSquare[row][col] = i;
        }
        */

        int row = 0;
        int col = size / 2;
        for (int i = 1; i <= size * size; i++) {
            this.magicSquare[row][col] = i;

            if (i % size == 0) {
                row++;
            } else {
                if (row == 0) {
                    row = size - 1;
                } else {
                    row--;
                }

                if (col == (size - 1)) {
                    col = 0;
                } else {
                    col++;
                }
            }
        }
    }

    public String arrayAsString(int[][] array) {
        StringBuilder arrayAsString = new StringBuilder();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arrayAsString.append(this.magicSquare[i][j]);
                arrayAsString.append(" ");
            }

            arrayAsString.append("\n");
        }

        return arrayAsString.toString();
    }
}
