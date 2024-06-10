package ch.hslu.informatik.ad.datenstrukturen.D1.E3;

import ch.hslu.informatik.ad.einfuehrung.E0.Allocation;
import ch.hslu.informatik.ad.einfuehrung.E0.Memory;
import ch.hslu.informatik.ad.einfuehrung.E0.MemorySimple;

public class StackDemo {

    public static void main(String[] args) {

        final Memory memory = new MemorySimple(1024);

        Stack<Allocation> stack = new StackImpl<>(5);
        System.out.println("IS EMTPY: " + stack.isEmpty());
        System.out.println("STACK SIZE: " + stack.size());
        System.out.println(stack);

        stack.push(memory.malloc(16));
        stack.push(memory.malloc(32));
        stack.push(memory.malloc(64));
        stack.push(memory.malloc(128));
        stack.push(memory.malloc(256));
        System.out.println("IS EMTPY: " + stack.isEmpty());
        System.out.println("STACK SIZE: " + stack.size());
        System.out.println("TOP OBJ: " + stack.peek());
        System.out.println(stack);

        stack.pop();
        System.out.println("STACK SIZE: " + stack.size());
        System.out.println("TOP OBJ: " + stack.peek());
        System.out.println(stack);

        stack.clean();
        System.out.println("IS EMTPY: " + stack.isEmpty());
        System.out.println("STACK SIZE: " + stack.size());
        System.out.println(stack);
    }
}
