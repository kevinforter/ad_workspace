package ch.hslu.D3.E2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class PerformanceCompare {

    public static String[] returnArray(int anzObject) {

        String[] arr = new String[anzObject];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = "Str_" + i;
        }

        return arr;
    }

    public static void addToStack(String[] arr) {

        Stack<String> stack = new Stack<>();

        for (String str : arr) {
            stack.push(str);
        }
    }

    public static void addToDeque(String[] arr) {

        Deque<String> deque = new ArrayDeque<>();

        for (String str : arr) {
            deque.add(str);
        }

    }
}
