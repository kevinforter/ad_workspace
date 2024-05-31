package ch.hslu.informatik.ad.einfuehrung.E1.E2;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import java.util.stream.Stream;

public class TaskDemo {

    public static final Logger LOG = LoggerFactory.getLogger(TaskDemo.class);

    public static void main(String[] args) {

        Stream<Integer> n = Stream.of(1, 2, 10, 20, 40, 80);

        n.forEach(i -> {
            try {
                Task.task(i);
            } catch (InterruptedException e) {
                LOG.info(e.getMessage());
            }
        });
    }
}
