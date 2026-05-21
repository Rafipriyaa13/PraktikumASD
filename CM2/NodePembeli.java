package CM2;
public class NodePembeli {
    Pembeli data;
    NodePembeli prev, next; 
    int noAntrian; 

    public NodePembeli(NodePembeli prev, Pembeli data, int noAntrian, NodePembeli next) {
        this.prev = prev;
        this.data = data;
        this.noAntrian = noAntrian;
        this.next = next;
    }
}