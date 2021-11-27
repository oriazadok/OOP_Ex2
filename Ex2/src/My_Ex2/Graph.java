package My_Ex2;

import api.DirectedWeightedGraph;
import api.EdgeData;
import api.NodeData;

import java.util.HashMap;
import java.util.Iterator;

public class Graph implements DirectedWeightedGraph {

    private HashMap<Integer, Node> nodes;
    private HashMap<Node, HashMap> node;

    private Iterator<Node> iterator = nodes.values().iterator();
    private Iterator<EdgeData> edge_Iter;

    private int sumOfEdges;
    private int mc;


    public Graph(HashMap<Integer, Node> nodes, HashMap<Node, HashMap> node, Iterator<api.NodeData> iterator) {
        this.nodes = nodes;
        this.node = node;
//        this.edges = edges;
//        this.iterator = nodes.it;
        this.sumOfEdges = 0;
        this.mc = 0;

    }

    @Override
    public NodeData getNode(int key) {
        if ((0 <= key) && (key < nodes.size())){
            return this.nodes.get(key);
        }
        return null;
    }

    @Override
    public EdgeData getEdge(int src, int dest) {
        if ((0 <= src) && (src < nodes.size()) && (0 <= dest) && (dest < nodes.size())) {
            Node t = nodes.get(src);
            return (EdgeData) node.get(t).get(dest);
        }
        return null;
    }

    @Override
    public void addNode(NodeData n) {
        if (n.getKey() < nodes.size()) {
            System.out.println("The id of this Node already exist");
            return;
        }
        this.nodes.put(n.getKey(), (Node) n);
        this.node.put((Node) n, new HashMap<Integer, EdgeData>());
    }

    @Override
    public void connect(int src, int dest, double w) {
        Edge e = new Edge(src, dest, w);
        Node t = (Node) getNode(src);
        node.get(t).put(dest, e);
        sumOfEdges++;
    }

    @Override
    public Iterator<NodeData> nodeIter() {

//        return this.iterator;
        return null;
    }

    @Override
    public Iterator<EdgeData> edgeIter() {
        return null;
    }

    @Override
    public Iterator<EdgeData> edgeIter(int node_id) {
        return null;
    }

    @Override
    public NodeData removeNode(int key) {
        Node t = (Node) getNode(key);
        this.nodes.remove(t);
        this.node.remove(t);

        for (int i=0; i< t.getArray().size(); i++) {
            Node temp = nodes.get(i);
            node.get(temp).remove(key);
        }
        return t;
    }

    @Override
    public EdgeData removeEdge(int src, int dest) {
        Node t = (Node) getNode(src);
        Edge e = (Edge) node.get(t).get(dest);
        node.get(t).remove(dest);
        return e;
    }

    @Override
    public int nodeSize() {
        return nodes.size();
    }

    @Override
    public int edgeSize() {
        return this.sumOfEdges;
    }

    @Override
    public int getMC() {
        return this.mc;
    }

}
