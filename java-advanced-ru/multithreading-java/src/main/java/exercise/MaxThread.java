package exercise;

import java.util.Arrays;

// BEGIN
public class MaxThread extends Thread {
    private int[] numbers;
    private static int max;

    public MaxThread(int[] numbers) {
        this.numbers = numbers;
    }
    // В классе нужно переопределить метод run()
    // В методе содержится логика, которую поток будет выполнять
    @Override
    public void run() {
        max = Arrays.stream(numbers).max().orElseThrow();
    }
    public int getMax() {
        return max;
    }
}
// END
