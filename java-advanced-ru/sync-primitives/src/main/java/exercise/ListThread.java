package exercise;

// BEGIN
public class ListThread extends Thread {

    SafetyList safetyList;

    ListThread(SafetyList safetyList) {
        this.safetyList = safetyList;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                int number = (int) (101 * Math.random());
                Thread.sleep(1);
                safetyList.add(number);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            }
        }
    }
// END
