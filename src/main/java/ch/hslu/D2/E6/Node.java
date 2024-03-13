package ch.hslu.D2.E6;

import java.util.Objects;

public class Node {

    private int Data;
    private int hash;
    private Node KindLinks;
    private Node KindRechts;

    public Node(int Data) {
        this.Data = Data;

        // Hashwert Inkrement
        this.hash = Integer.hashCode(Data);
        KindLinks = null;
        KindRechts = null;
    }

    public int getData() {
        return Data;
    }

    public Node getKindLinks() {
        return KindLinks;
    }

    public Node getKindRechts() {
        return KindRechts;
    }

    public int getHash() {
        return hash;
    }

    public void setKindLinks(Node kindLinks) {
        this.KindLinks = kindLinks;
    }

    public void setKindRechts(Node kindRechts) {
        this.KindRechts = kindRechts;
    }

    public void setData(int data) {
        this.Data = data;
    }

    public void setHash(int hash) {
        this.hash = hash;
    }

    @Override
    public String toString() {
        return "Node{" +
                "Data=" + Data +
                ", hash=" + hash +
                ", KindLinks=" + KindLinks +
                ", KindRechts=" + KindRechts +
                '}';
    }

    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node node)) return false;
        return getData() == node.getData() && getHash() == node.getHash() && Objects.equals(getKindLinks(), node.getKindLinks()) && Objects.equals(getKindRechts(), node.getKindRechts());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getData(), getHash(), getKindLinks(), getKindRechts());
    }

     */
}
