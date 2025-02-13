package exercise;

import java.util.Map;
import java.util.logging.Logger;
import java.util.logging.Level;

class App {
    private static final Logger LOGGER = Logger.getLogger("AppLogger");

    // BEGIN
    public static Map<String, Integer> getMinMax(int[] numbers) {
        var maxThread = new MaxThread(numbers);
        var minThread = new MinThread(numbers);

        maxThread.start();
        LOGGER.log(Level.INFO, "Thread %s started".formatted(maxThread.getName()));
        minThread.start();
        LOGGER.log(Level.INFO, "Thread %s started".formatted(maxThread.getName()));
        try {
            maxThread.join();
            LOGGER.log(Level.INFO, "Thread %s finished".formatted(maxThread.getName()));
            minThread.join();
            LOGGER.log(Level.INFO, "Thread %s finished".formatted(maxThread.getName()));
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
        return Map.of(
                "min", minThread.getMin(),
                "max", maxThread.getMax()
        );
    }

    // END
}
