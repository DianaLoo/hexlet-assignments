package exercise;

import java.util.Arrays;

// BEGIN
public class MinThread extends Thread {
    private int[] numbers;
    private static int min;
    public MinThread(int[] numbers) {
        this.numbers = numbers;
    }
    // В классе нужно переопределить метод run()
    // В методе содержится логика, которую поток будет выполнять
    @Override
    public void run() {
        min = Arrays.stream(numbers).min().orElseThrow();
    }

    public int getMin() {
        return min;
    }
}
// END
