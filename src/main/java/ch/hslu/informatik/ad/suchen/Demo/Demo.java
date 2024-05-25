package ch.hslu.informatik.ad.suchen.Demo;

import ch.hslu.informatik.ad.suchen.A4.E2.OptimizedSearch;
import ch.hslu.informatik.ad.suchen.A4.E3.KMP;
import ch.hslu.informatik.ad.suchen.A4.E5.OptimalMissMatch;
import ch.hslu.informatik.ad.suchen.A4.E5.QuickSearch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Demo {

    private static final Logger LOG = LoggerFactory.getLogger(Demo.class);

    public static void main(String[] args) {

        String content = null;

        try {
            content = Files.readString(Path.of("/Users/kevinforter/Library/CloudStorage/OneDrive-HochschuleLuzern/HSLU/2024/FS24/AD/ad_workspace/src/main/java/ch/hslu/informatik/ad/suchen/Demo/random-1G"), StandardCharsets.ISO_8859_1);
            LOG.info("TIME FOR FILE: random-1G");
            LOG.info("----------------------------------------------------");
        } catch (IOException e) {
            LOG.error("ERROR accused while reading file in: " + e);
        }

        // OptimizedSearch
        long start = System.nanoTime();
        int indexOS = OptimizedSearch.stateSearch("ANANAS");
        long end = System.nanoTime();

        double time = (end - start) / 1E9;
        time = Double.parseDouble(String.format("%.4f", time));
        LOG.info(String.format("%-20s %14s %10s", "Time for Optimized Search:", time, "sec"));

        // kmpSearch
        assert content != null;
        start = System.nanoTime();
        int indexKMP = KMP.kmpSearch(content, "ANANAS");
        end = System.nanoTime();

        time = (end - start) / 1E9;
        time = Double.parseDouble(String.format("%.4f", time));
        LOG.info(String.format("%-20s %20s %10s", "Time for KMP Search:", time, "sec"));

        // QuickSearch
        start = System.nanoTime();
        int indexQS = QuickSearch.quickSearch(content, "ANANAS");
        end = System.nanoTime();

        time = (end - start) / 1E9;
        time = Double.parseDouble(String.format("%.4f", time));
        LOG.info(String.format("%-20s %19s %10s", "Time for QuickSearch:", time, "sec"));

        // OptimalMissMatch oder Optimized Search
        start = System.nanoTime();
        int indexOMM = OptimalMissMatch.optimalMissMatch(content, "ANANAS");
        end = System.nanoTime();

        time = (end - start) / 1E9;
        time = Double.parseDouble(String.format("%.4f", time));
        LOG.info(String.format("%-20s %14s %10s", "Time for QptimalMissMatch:", time, "sec"));
    }
}