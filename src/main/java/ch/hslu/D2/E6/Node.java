package ch.hslu.D2.E6;

public class Node {

    private int Data;
    private int hash;
    private Node KindLinks;
    private Node KindRechts;

    public Node(int Data) {
        this.Data = Data;
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Node node = (Node) obj;
        return Data == node.Data;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Data;
        return result;
    }
}
