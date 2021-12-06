package My_Ex2;

import api.EdgeData;

public class Edge implements EdgeData {
    private int src;
    private int dest;
    private double w;
    private int tag;

    public  Edge(int src,int dest ,double w){
        if (w < 0) {
            throw new ArithmeticException("You inserted a nagative value");
        }
        this.src = src;
        this.dest = dest;
        this.w = w;
        this.tag = 0 ;

    }


    @Override
    public int getSrc() {
        return this.src;
    }

    @Override
    public int getDest() {
        return this.dest;
    }

    @Override
    public double getWeight() {
        return this.w;
    }

    @Override
    public String getInfo() {              //unimplement
        return null;
    }

    @Override
    public void setInfo(String s) {                  //unimplement

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