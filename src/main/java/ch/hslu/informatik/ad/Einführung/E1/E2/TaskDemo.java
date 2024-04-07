package ch.hslu.informatik.ad.Einführung.E1.E2;

import java.util.logging.Logger;
import java.util.stream.Stream;

public class TaskDemo {

    public static final Logger LOG = Logger.getLogger(TaskDemo.class.getName());

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        Stream<Integer> n = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100);

        n.forEach(i -> {
            try {
                Task.task(i);
            } catch (InterruptedException e) {
                LOG.info(e.getMessage());
            }
        });

        long end = System.currentTimeMillis();
        long duration = end - start;

        LOG.info("Total Duration: " + duration + " ms");
    }
}
