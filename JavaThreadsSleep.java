public class JavaThreadsSleep {

    static class Worker extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(10);
            } catch (InterruptedException ignored) {
            }
        }
    }

    public static void main(String[] args) throws Exception {
        final int N = 10_000;
        Thread[] threads = new Thread[N];

        long start = System.currentTimeMillis();

        for (int i = 0; i < N; i++) {
            threads[i] = new Worker();
            threads[i].start();
        }

        for (int i = 0; i < N; i++) {
            threads[i].join();
        }

        long elapsed = System.currentTimeMillis() - start;
        System.out.println("Java (OS Threads): Finished " + N + " threads in " + elapsed + " ms");
    }
}