/**
 * Created by Танечка on 14.03.2017.
 */
public class Distance {
    public double x1;
    public double y1;
    public double x2;
    public double y2;
    public double l;
    public double x;
    public double y;
    public Distance(double x1, double y1, double x2, double y2){
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
        this.x = x1 - x2;
        this.y = y1 - y2;

    }
    public double area() {
        return l = Math.sqrt(this.x * this.x + this.y * this.y);
    }
}
