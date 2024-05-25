package ch.hslu.informatik.ad.datenstrukturen.D2.E5;

public class Node {

    private int Data;
    private Node KindLinks;
    private Node KindRechts;

    public Node (int Data) {
        this.Data = Data;
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

    public void setKindLinks(Node kindLinks) {
        this.KindLinks = kindLinks;
    }

    public void setKindRechts(Node kindRechts) {
        this.KindRechts = kindRechts;
    }

    @Override
    public String toString() {
        return "Node{" +
                "Data=" + Data +
                ", KindLinks=" + KindLinks +
                ", KindRechts=" + KindRechts +
                '}';
    }
}
