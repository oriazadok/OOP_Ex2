package My_Ex2;

import api.GeoLocation;
import api.NodeData;

import java.util.ArrayList;

public class Node implements NodeData {
    private int key;
    private int tag;
    private Location location;

    public Node(int key, Location location){
        this.key = key;
        this.location = location;
        this.tag = 0;
    }



    @Override
    public int getKey() {
        return this.key;
    }

    @Override
    public GeoLocation getLocation() {
        return this.location;
    }

    @Override
    public void setLocation(GeoLocation p) {
        location.setX(p.x());
        location.setY(p.y());
    }

    @Override
    public double getWeight() {
        return 0;
    }                        //unimplemet

    @Override
    public void setWeight(double w) {

    }                        //unimplemet

    @Override
    public String getInfo() {                        //unimplemet
        return null;
    }

    @Override
    public void setInfo(String s) {                    //unimplemet

    }

    @Override
    public int getTag() {
        return this.tag;
    }

    @Override
    public void setTag(int t) {
        this.tag = t;
    }
}