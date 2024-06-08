package ch.hslu.informatik.ad.einfuehrung.E1.E7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class CheckSymmetricNumbers {

    private static final Logger LOG = LoggerFactory.getLogger(CheckSymmetricNumbers.class);

    public static void main(String[] args) {

        int input = 1001;
        boolean output = check(input);

        LOG.info("Zahl " + input + " ist Symmetrisch: " + output);

    }

    public static boolean check(int input) {

        List<Character> arrayList = new ArrayList<>();
        String inputAsString = String.valueOf(input);

        for (int i = 0; i < inputAsString.length(); i++) {
            arrayList.add(inputAsString.charAt(i));
        }

        List<Character> reversedList = arrayList.reversed();

        return reversedList.equals(arrayList);
    }
}
