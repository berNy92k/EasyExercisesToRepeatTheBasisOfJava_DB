package thread;

public class ThreadClass implements Runnable {

    private String name;
    private volatile boolean isWorking = true;

    public ThreadClass(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (isWorking) {
                System.out.println(i + ": " + name);
            } else {
                break;
            }
        }
    }

    public void stop() {
        isWorking = false;
    }
}
