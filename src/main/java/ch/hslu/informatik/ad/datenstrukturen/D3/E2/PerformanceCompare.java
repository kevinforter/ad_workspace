package ch.hslu.informatik.ad.datenstrukturen.D3.E2;

import ch.hslu.informatik.ad.datenstrukturen.D1.E3.StackImpl;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class PerformanceCompare {

    public static void addToStack(String[] arr) {

        Stack<String> stack = new Stack<>();

        for (String str : arr) {
            stack.push(str);
        }
    }

    public static void addToOwnStack(String[] arr, int size) {

        ch.hslu.informatik.ad.datenstrukturen.D1.E3.Stack<String> stack = new StackImpl<>(size);

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
