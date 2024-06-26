package ch.hslu.informatik.ad.einfuehrung.E1.E2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Task {

    private static final Logger LOG = LoggerFactory.getLogger(Task.class);

    private static int counter1 = 0;
    private static int counter2 = 0;
    private static int counter3 = 0;
    private static int totalCounter = 0;

    public static void task(final int n) throws InterruptedException {
        counter1 = 0;
        counter2 = 0;
        counter3 = 0;
        totalCounter = 0;

        long start = System.currentTimeMillis();

        task1(); task1(); task1(); task1();
        for (int i = 0; i < n; i++) {
            task2(); task2(); task2();
            for (int j = 0; j < n; j++) {
                task3(); task3();
            }
        }
        long end = System.currentTimeMillis();
        long duration = end - start;

        LOG.info(String.format("N: %27s %d","", n));
        LOG.info(String.format("Counters: %20s %d T1, %d T2, %d T3", "", counter1, counter2, counter3));
        LOG.info(String.format("Total counter: %15s %d", "", totalCounter));
        LOG.info(String.format("Duration: %20s %d ms", "", duration));
        LOG.info("");
    }

    private static void task1() throws InterruptedException {
        Thread.sleep(5);
        counter1++;
        totalCounter++;
    }

    private static void task2() throws InterruptedException {
        Thread.sleep(5);
        counter2++;
        totalCounter++;
    }

    private static void task3() throws InterruptedException {
        Thread.sleep(5);
        counter3++;
        totalCounter++;
    }
}
