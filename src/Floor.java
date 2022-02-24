package src;

public class point {
    private int x;
    private int y;
    public point(){

    }
    public point(int x, int y){
         setX (x);
         setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return  y;
    }

    public void setY(int y) {
        this.y = y;
    }
public  double getDistance(){

    return (Math.sqrt((x*x)+(y*y)));
}
public double getDistance(int x1,int y1){
        return (Math.sqrt(((x-x1)*(x-x1))+((y-y1)*(y-y1))));
}


}
