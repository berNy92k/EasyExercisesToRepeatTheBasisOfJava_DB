package thread;

public class ThreadTest {

    public static void main(String[] args) {

        ThreadClass threadClass1 = new ThreadClass("T1");
        ThreadClass threadClass2 = new ThreadClass("T2");

        Thread thread1 = new Thread(threadClass1);
        Thread thread2 = new Thread(threadClass2);

        thread1.start();
        thread2.start();
    }

}
