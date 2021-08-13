
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LotteryRow {
    private Random random;
    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        this.random = new Random();
        // Implement the random number generation here
        // the method containsNumber is probably useful
        while(this.numbers.size() != 7) {
            int lotteryNumber = random.nextInt(40) + 1;
            if(!this.numbers.contains(lotteryNumber))
                this.numbers.add(lotteryNumber);
        }

        Collections.sort(this.numbers);
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }
}

