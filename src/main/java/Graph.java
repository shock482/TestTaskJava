import java.util.HashSet;
import java.util.Set;

public class Graph {

    private Set<Node> nodes = new HashSet<>();

    public Graph() {
    }

    public String[] getNodeNames() {
        String[] arrayString = new String[nodes.size()];
        int i = 0;
        for (Node node : nodes) {
            arrayString[i] = node.getName();
            i++;
        }
        return arrayString;
    }

    public void addNode(Node nodeA) {
        nodes.add(nodeA);
    }

    public Set<Node> getNodes() {
        return nodes;
    }

    public void setNodes(Set<Node> nodes) {
        this.nodes = nodes;
    }

    @Override
    public String toString() {
        return "Graph{" +
                "nodes=" + nodes.toString() +
                '}';
    }
}