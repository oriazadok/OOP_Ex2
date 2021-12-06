package My_Ex2;

import api.DirectedWeightedGraph;
import api.DirectedWeightedGraphAlgorithms;
import api.NodeData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class My_Algo implements DirectedWeightedGraphAlgorithms {

    private Graph g;
//    ArrayList<Integer> accessible = new ArrayList<>(this.g.nodeSize() -1);
    int accessible = 0;
    public My_Algo(Graph g){
        this.g = g;

    }

    @Override
    public void init(DirectedWeightedGraph g) {
        this.g = (Graph) g;
    }

    @Override
    public DirectedWeightedGraph getGraph() {
        return this.g;
    }

    @Override
    public DirectedWeightedGraph copy() {
        HashMap<Integer, Node> nodes = new HashMap<>();
        HashMap<Node, HashMap> edges = new HashMap<>();
        DirectedWeightedGraph newGraph = new Graph(nodes, edges);

        for (Node n : this.g.getNodes().values()) {

            Node newNode = new Node(n.getKey(), (Location) n.getLocation());
            newGraph.addNode(newNode);

            HashMap<Integer, Edge> hm = this.g.getEdges().get(n);
            for (Edge edge : hm.values()) {
                newGraph.connect(edge.getSrc(), edge.getDest(), edge.getWeight());
            }
        }
        return newGraph;
    }

    @Override
    public boolean isConnected() {
        if((g.edgeSize() == 0) && (g.nodeSize() == 1)) { return true;}
        if (g.edgeSize() < g.nodeSize()) { return false;}
//        for(int i=0; i< g.nodeSize(); i++){
//            Node n = (Node) g.getNode(i);
//            if ((n.getArrowsIn().size() == 0) || (n.getArrowsOut().size() == 0)){
//                return false;
//            }
//        }
        resetTags();
        int firstNodeId = (int) this.g.getNodes().keySet().toArray()[0];
        DFS(firstNodeId);

        if (this.g.nodeSize() -1 != this.accessible) {
            return false;
        }
        return false;
    }

    public void DFS(int firstNodeId) {
        Node n = (Node) this.g.getNode(firstNodeId);
        if (n.getTag() == 1) {
            return;
        }
        for (int i=0; i<n.getArrowsOut().size(); i++) {
            int t = (int) n.getArrowsOut().get(i);
            Node node = (Node) this.g.getNode(t);

            if (node.getTag() == 0) {
                node.setTag(1);
                accessible++;
            }
            DFS(t);
        }
    }

    public void resetTags() {
        for (Node n : this.g.getNodes().values()) {
            n.setTag(0);
        }
    }



    @Override
    public double shortestPathDist(int src, int dest) {
        Node s = (Node) g.getNode(src);
        Node d = (Node) g.getNode(dest);

        return 0;
    }

    @Override
    public List<NodeData> shortestPath(int src, int dest) {
        return null;
    }
//BFS
    //we can go over all nodes and check the biggest distance
    // and return the lower distance
    @Override
    public NodeData center() {
        int min = 0;




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
//        try {
//            GsonBuilder builder = new GsonBuilder();
//            builder.registerTypeAdapter(DWGraph_DS.class, new json_to_graph());
//            Gson gson = builder.create();
//            FileReader reader = new FileReader(file);
//            g= gson.fromJson(reader, DWGraph_DS.class);
//            return true;
//        }
//        catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        return false;
    }
}