package ch.hslu.informatik.ad.datenstrukturen.D1.E3;

public class StackDemo {

    public static void main(String[] args) {

        Stack<String> stack = new StackImpl<String>(5);
        System.out.println("IS EMTPY: " + stack.isEmpty());
        System.out.println("STACK SIZE: " + stack.size());

        stack.push("Hallo");
        stack.push("MY");
        stack.push("NAME");
        stack.push("IS");
        stack.push("KEVIN");
        System.out.println("IS EMTPY: " + stack.isEmpty());
        System.out.println("STACK SIZE: " + stack.size());

        System.out.println("TOP OBJ: " + stack.peek());

        stack.pop();
        System.out.println("STACK SIZE: " + stack.size());
        System.out.println("TOP OBJ: " + stack.peek());
        System.out.println(stack);
    }
}
