
public class MagicSquareFactory {
    public MagicSquare createMagicSquare(int size) {
        MagicSquare magicSquare = new MagicSquare(size);

        // Siamese Algorithm -> (It also works if you swap the values in x and y - the MagicSquare will be slightly different, but still correct)
        int x = 0, y = size / 2;
        int currentNumber = 1, capacity = size * size;

        // Place all the numbers 1 to (size * size) into the MagicSquare (2D Array)
        while(currentNumber <= capacity) {
            // Place the currentNumber into the corresponding position in the MagicSquare
            magicSquare.placeValue(x, y, currentNumber);

            // We move one row up
            int positionX = x - 1;
            // We move one column right
            int positionY = y + 1;

            // If the next 'x' position is outside the boundaries of MagicSquare, then we set next 'x' position to last row in MagicSquare
            if(positionX < 0)
                positionX += size;

            // If the next 'y' position is outside the boundaries of MagicSquare, then we set next 'y' position to the first column in MagicSquare
            if(positionY >= size)
                positionY %= size;

            // If the next 'x' and 'y' position happens to not be filled (still 0), then we update x's and y's position with the
            // next 'x' and 'y' position
            if(magicSquare.readValue(positionX, positionY) == 0) {
                x = positionX;
                y = positionY;
            } else { // If the next 'x' and 'y' position is filled (not 0), then we go down one row ('x') in MagicSquare
                x++;
                if(x >= size)
                    x %= size;
            }

            // Once currentNumber has been placed in MagicSquare, go to the next number
            currentNumber++;
        }

        return magicSquare;
    }
}
