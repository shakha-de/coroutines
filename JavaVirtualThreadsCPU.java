public class JavaVirtualThreadsCPU {

    static class Worker extends Thread {
        @Override
        public void run() {
            long sum = 0;
            for (int i = 0; i < 1_000_000; i++) {
                sum += i;
            }
            if (sum == -1)
                System.out.println("Never happens");
        }
    }

    public static void main(String[] args) throws Exception {
        final int N = 10_000;
        Thread[] threads = new Thread[N];

        long start = System.currentTimeMillis();

        for (int i = 0; i < N; i++) {
            threads[i] = Thread.ofVirtual().start(new Worker());
        }

        for (int i = 0; i < N; i++) {
            threads[i].join();
        }

        long elapsed = System.currentTimeMillis() - start;
        System.out.println("Java (Virtual Threads): Finished " + N + " threads (CPU-bound) in " + elapsed + " ms");
    }
}