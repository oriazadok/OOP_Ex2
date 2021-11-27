package My_Ex2;

import api.DirectedWeightedGraph;
import api.DirectedWeightedGraphAlgorithms;
import api.NodeData;

import java.util.ArrayList;
import java.util.List;

public class My_Algo implements DirectedWeightedGraphAlgorithms {

    private Graph g;
    private int[][] neighbor_matrix;
    private ArrayList<Integer> pos;

    public My_Algo(Graph g){
        this.g = g;
        neighbor_matrix = new int[g.nodeSize()][g.nodeSize()];
        pos = new ArrayList<>(g.nodeSize());
    }

    // this function will read the json file and put the value in "private Graph g"
    @Override
    public void init(DirectedWeightedGraph g) {

    }

    @Override
    public DirectedWeightedGraph getGraph() {
        return this.g;
    }

    @Override
    public DirectedWeightedGraph copy() {
        return null;
    }

    @Override
    public boolean isConnected() {
        return false;
    }

    @Override
    public double shortestPathDist(int src, int dest) {
        return 0;
    }

    @Override
    public List<NodeData> shortestPath(int src, int dest) {
        return null;
    }

    @Override
    public NodeData center() {
        return null;
    }

    @Override
    public List<NodeData> tsp(List<NodeData> cities) {
        return null;
    }

    @Override
    public boolean save(String file) {
        return false;
    }

    @Override
    public boolean load(String file) {
        return false;
    }
}