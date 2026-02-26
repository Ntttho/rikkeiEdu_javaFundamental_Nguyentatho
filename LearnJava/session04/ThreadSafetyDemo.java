package learnJava.session04;

public class ThreadSafetyDemo {
    public static void main(String[] args) throws InterruptedException {
        int iterations = 1000;

        // 1. Thử nghiệm với StringBuilder (Không an toàn)
        StringBuilder sb = new StringBuilder();
        runTest(sb, iterations);
        System.out.println("StringBuilder result length: " + sb.length() + " (Expect: " + (iterations * 2) + ")");

        // 2. Thử nghiệm với StringBuffer (An toàn)
        StringBuffer sbf = new StringBuffer();
        runTest(sbf, iterations);
        System.out.println("StringBuffer result length: " + sbf.length() + " (Expect: " + (iterations * 2) + ")");
    }

    private static void runTest(Object builder, int iterations) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 0; i < iterations; i++) {
                if (builder instanceof StringBuilder)
                    ((StringBuilder) builder).append("A");
                else if (builder instanceof StringBuffer)
                    ((StringBuffer) builder).append("A");
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join(); // Chờ luồng 1 xong
        t2.join(); // Chờ luồng 2 xong
    }
}
