package ch.hslu.informatik.ad.datenstrukturen.D3.E2;

public class ObjectArray {

    public static String[] returnArray(int anzObject) {

        String[] arr = new String[anzObject];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = "Str_" + i;
        }

        return arr;
    }
}
