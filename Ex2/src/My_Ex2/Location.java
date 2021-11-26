package My_Ex2;

import api.GeoLocation;

public class Location implements GeoLocation {

    private double x;
    private double y;
    private double z;

    public Location(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double y) {
        this.z = z;
    }



    @Override
    public double x() {
        return this.x;
    }

    @Override
    public double y() {
        return this.y;
    }

    @Override
    public double z() {
        return this.z;
    }

    @Override
    public double distance(GeoLocation g) {

        double dis_x = Math.abs(this.x - g.x());
        double dis_y = Math.abs(this.y - g.y());
        dis_x = dis_x * dis_x;
        dis_y = dis_y * dis_y;
        return Math.sqrt(dis_x + dis_y);
    }


}
