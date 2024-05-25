package ch.hslu.informatik.ad.suchen.A4.E5;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

    @Test
    public void quickSearchReturnsCorrectIndexWhenPatternFound() {
        String text = "HelloWorld";
        String pattern = "World";
        int index = QuickSearch.quickSearch(text, pattern);
        assertEquals(5, index);
    }

    @Test
    public void quickSearchReturnsMinusOneWhenPatternNotFound() {
        String text = "HelloWorld";
        String pattern = "Java";
        int index = QuickSearch.quickSearch(text, pattern);
        assertEquals(-1, index);
    }

    @Test
    public void quickSearchReturnsZeroWhenPatternIsAtStart() {
        String text = "HelloWorld";
        String pattern = "Hello";
        int index = QuickSearch.quickSearch(text, pattern);
        assertEquals(0, index);
    }

    @Test
    public void quickSearchReturnsCorrectIndexWhenPatternIsAtEnd() {
        String text = "HelloWorld";
        String pattern = "World";
        int index = QuickSearch.quickSearch(text, pattern);
        assertEquals(5, index);
    }
}