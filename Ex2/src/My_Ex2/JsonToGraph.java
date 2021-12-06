//package My_Ex2;
//
//import api.DirectedWeightedGraph;
//import com.google.gson.*;
//
//import java.lang.reflect.Type;
//import java.util.Map.Entry;
//
//
//public class jsonToGraph implements JsonDeserializer<DirectedWeightedGraph> {
//    @Override
//    public DirectedWeightedGraph deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
//        JsonObject jsongraph =jsonElement.getAsJsonObject();
//        DirectedWeightedGraph g=new Graph();
//        int edgeCount = jsongraph.get("edgeCount").getAsInt();
//        JsonObject nodesjson =jsongraph.get("Nodes").getAsJsonObject();
//        JsonObject edgesjson =jsongraph.get("Edges").getAsJsonObject();
//        for (Entry<String,JsonElement> set :nodesjson.entrySet()) {
//            JsonElement nodej = set.getValue();
//            int key = nodej.getAsJsonObject().get("id").getAsInt();
//            int tag = nodej.getAsJsonObject().get("tag").getAsInt();
//            double w = nodej.getAsJsonObject().get("weight").getAsDouble();
//            String in = nodej.getAsJsonObject().get("Info").getAsString();
//            Node n=new Graph.Node(key,tag,w,in);
//            g.addNode(n);
//
//        }
//        for(Entry<String,JsonElement> set :edgesjson.entrySet())
//        {
//            JsonElement edges = set.getValue();
//
//            for(Entry<String,JsonElement>setedges  :edges.getAsJsonObject().entrySet()) {
//                String destKey = setedges.getKey();
//                JsonElement edgej = setedges.getValue();
//                int src = edgej.getAsJsonObject().get("src").getAsInt();
//                int dest = edgej.getAsJsonObject().get("dest").getAsInt();
//                double w = edgej.getAsJsonObject().get("w").getAsDouble();
//                Graph.EdgeData e = new Graph.EdgeData(src, dest, w);
//                g.connect(src, dest, w);
//            }
//
//        }
//
//        return g;
//    }
//
//}