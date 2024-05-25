package ch.hslu.informatik.ad.suchen.A4.E5;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class QuickSearchTest {

    private static final Logger LOG = LoggerFactory.getLogger(QuickSearchTest.class);

    @Test
    public void testQuickSearch_whenPatternNotFoundReturnsMinusOne_thenCorrect() {
        String pattern = RandomStringUtils.random(5, true, false);
        String zeichenKette = RandomStringUtils.random(10, true, false);

        LOG.info("p: " + pattern);
        LOG.info("a: " + zeichenKette);

        int indexQS = QuickSearch.quickSearch(zeichenKette, pattern);
        assertEquals(-1, indexQS);
    }

    @Test
    public void testQuickSearch_whenPatternFoundReturnsIndexFive_thenCorrect() {
        String pattern = RandomStringUtils.random(5, true, false);
        String zeichenKette = RandomStringUtils.random(10, true, false);

        char[] patternArray = pattern.toCharArray();
        char[] zeichenKetteArray = zeichenKette.toCharArray();

        System.arraycopy(patternArray, 0, zeichenKetteArray, 5, pattern.length());

        zeichenKette = new String(zeichenKetteArray);

        LOG.info("p: " + pattern);
        LOG.info("a: " + zeichenKette);

        int indexQS = QuickSearch.quickSearch(zeichenKette, pattern);
        assertEquals(5, indexQS);
    }

}