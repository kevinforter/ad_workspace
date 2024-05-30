package ch.hslu.informatik.ad.einfuehrung.E0;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MemoryDemo {

    private static final Logger LOG = LoggerFactory.getLogger(MemoryDemo.class);

    public static void main(final String[] args) {

        final Memory memory = new MemorySimple(1024);
        LOG.info(memory.toString());

        LOG.info("Block 1 hinzufügen:");
        final Allocation block1 = memory.malloc(16);
        LOG.info(String.valueOf(block1));
        LOG.info(memory.toString());

        LOG.info("Block 2 hinzufügen:");
        final Allocation block2 = memory.malloc(8);
        LOG.info(String.valueOf(block2));
        LOG.info(memory.toString());

        LOG.info("Block 3 hinzufügen:");
        final Allocation block3 = memory.malloc(24);
        LOG.info(String.valueOf(block3));
        LOG.info(memory.toString());

        LOG.info("Block 1 entfernen:");
        memory.free(block1);
        LOG.info(memory.toString());

        LOG.info("Block 4 hinzufügen:");
        final Allocation block4 = memory.malloc(32);
        LOG.info(String.valueOf(block4));
        LOG.info(memory.toString());
    }
}