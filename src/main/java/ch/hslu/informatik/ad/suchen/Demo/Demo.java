package ch.hslu.informatik.ad.suchen.Demo;

import ch.hslu.informatik.ad.suchen.A4.E2.OptimizedSearch;
import ch.hslu.informatik.ad.suchen.A4.E3.KMP;
import ch.hslu.informatik.ad.suchen.A4.E5.QuickSearch;

public class Demo {

    public static void main(String[] args) {



        // You need to provide the string and pattern to the kmpSearch method
        int indexKMP = KMP.kmpSearch("BNMANANASZUW", "ANANAS");
        System.out.println("\nKMP index: " + indexKMP);

        // You need to provide the string and pattern to the kmpSearch method
        int indexQS = QuickSearch.quickSearch("BNMANANASZUW", "ANANAS");
        System.out.println("\nQuickSearch index: " + indexQS);
    }
}