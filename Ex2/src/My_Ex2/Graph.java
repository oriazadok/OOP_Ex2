package My_Ex2;

import api.DirectedWeightedGraph;
import api.EdgeData;
import api.NodeData;

import java.util.ArrayList;
import java.util.Iterator;

public class Graph implements DirectedWeightedGraph {

    private ArrayList<NodeData> nodes;
    private ArrayList<Edge> edges;

    private Iterator<NodeData> iterator;

    private Graph(ArrayList<NodeData> nodes, ArrayList<Edge> edges, Iterator<NodeData> iterator){
        this.nodes=nodes;
        this.edges = edges;
        this.iterator=iterator;

    }

    @Override
    public NodeData getNode(int key) {
        return this.nodes.get(key);
    }

    @Override
    public EdgeData getEdge(int src, int dest) {                                /**need to ask */
        for(int i=0; i<this.edges.size(); i++){
            if ((edges.get(i).getSrc() == src) && (edges.get(i).getDest() == dest)) {
                return edges.get(i);
            }
        }
        return null;
    }

    @Override
    public void addNode(NodeData n) {
        this.nodes.add(n);
    }

    @Override
    public void connect(int src, int dest, double w) {
        Edge e = new Edge(src, dest, w);
        this.edges.add(e);
    }

    @Override
    public Iterator<NodeData> nodeIter() {
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
        return null;
    }

    @Override
    public EdgeData removeEdge(int src, int dest) {
        return null;
    }

    @Override
    public int nodeSize() {
        return 0;
    }

    @Override
    public int edgeSize() {
        return 0;
    }

    @Override
    public int getMC() {
        return 0;
    }
}
