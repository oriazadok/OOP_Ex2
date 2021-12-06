package My_Ex2;

import api.DirectedWeightedGraph;
import api.EdgeData;
import api.NodeData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Graph implements DirectedWeightedGraph {

    private HashMap<Integer, Node> nodes;
    private HashMap<Node, HashMap> edges;
    private int sumOfEdges;
    private int mc;

    public Graph(HashMap<Integer, Node> nodes, HashMap<Node, HashMap> edges) {
        this.nodes = nodes;
        this.edges = edges;
        this.sumOfEdges = 0;
        this.mc = 0;

    }

    public HashMap<Integer, Node> getNodes() {
        return this.nodes;
    }

    public void setNodes(HashMap<Integer, Node> nodes) {
        this.nodes = nodes;
    }

    public HashMap<Node, HashMap> getEdges() {
        return this.edges;
    }

    public void setEdges(HashMap<Node, HashMap > edges) {
        this.edges = edges;
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
        if ((0 <= src) && (src < this.nodes.size()) && (0 <= dest) && (dest < this.nodes.size())) {
            Node n = (Node) getNode(src);
            return (EdgeData) this.edges.get(n).get(dest);
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
        this.edges.put((Node) n, new HashMap<Integer, Edge>());
    }

    @Override
    public void connect(int src, int dest, double w) {
        if (src == dest){
            System.out.println("src and dest must have different valus");
            return;
        }
        Edge e = new Edge(src, dest, w);

        Node n = (Node) getNode(src);
        this.edges.get(n).put(dest, e);

        //insert into the in/out arraylist of the nodes
        n.getArrowsOut().add(dest);
        Node d = (Node) getNode(dest);
        d.getArrowsIn().add(src);

    }

    @Override
    public Iterator<NodeData> nodeIter() {
        ArrayList<NodeData> ans = new ArrayList<>();
        for (Node n : this.nodes.values()) {
               ans.add(n);
        }
        return ans.iterator();
    }

    @Override
    public Iterator<EdgeData> edgeIter() {
        ArrayList<EdgeData> ans = new ArrayList<>();
//        for (Edge e : this.edges.values()) {
//            ans.add(e);
//        }
        return ans.iterator();
    }

    @Override
    public Iterator<EdgeData> edgeIter(int node_id) {
        ArrayList<EdgeData> ans = new ArrayList<>();
//        for (Edge e : this.edges.values()) {
//            if ((e.getSrc() == node_id)) {
//                ans.add(e);
//            }
//        }
        return ans.iterator();
    }

    @Override
    public NodeData removeNode(int key) {
        if (this.nodes.containsKey(key) == false) {
            System.out.println("this key does'nt exist");
            return null;
        }
        Node n = (Node) getNode(key);

        ArrayList in = n.getArrowsIn();

        this.edges.remove(n);

        for (int i=0; i<in.size(); i++) {
            Node t = (Node) getNode((Integer) in.get(i));
            this.edges.get(t).remove(key);
        }

        this.nodes.remove(n.getKey());
        return n;
    }

    @Override
    public EdgeData removeEdge(int src, int dest) {
        Node n = (Node) getNode(src);
        Edge e = (Edge) edges.get(n).get(dest);
        this.edges.get(n).remove(dest);
        sumOfEdges--;
        return e;
    }

    @Override
    public int nodeSize() {
        return this.nodes.size();
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
