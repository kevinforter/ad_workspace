package ch.hslu.informatik.ad.sortierungen.A2.E2;

import org.apache.commons.lang3.RandomStringUtils;

public class Util {

    public static char[] randomChars(final int length) {

        return RandomStringUtils.randomAlphabetic(length).toCharArray();
    }
}
