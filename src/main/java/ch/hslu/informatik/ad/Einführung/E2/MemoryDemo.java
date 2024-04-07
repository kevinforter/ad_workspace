package ch.hslu.informatik.ad.Einführung.E2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MemoryDemo {

    private static final Logger LOG = LoggerFactory.getLogger(MemoryDemo.class);

    public static void main(final String[] args) {

        final Memory memory = new MemorySimple(1024);
        LOG.info(memory.toString());

        final Allocation block1 = memory.malloc(16);
        LOG.info(String.valueOf(block1));
        LOG.info(memory.toString());
        final Allocation block2 = memory.malloc(8);
        LOG.info(String.valueOf(block2));
        LOG.info(memory.toString());

        memory.free(block1);
        LOG.info(memory.toString());
    }
}