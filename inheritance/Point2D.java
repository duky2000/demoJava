package inheritance;

public class Point2D {
    private float x = 0.0f;
    public float y = 0.0f;
    public Point2D (){

    }
    public Point2D(float x , float y ){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float [] arr = {getX(),getY()};
        return arr;
    }

    @Override
    public String toString() {
        return "Foint2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
class Point3D extends Point2D{
    private float z = 0.0f;
    public Point3D(){

    }
    public Point3D(float z ,float x,float y){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y , float z){
        this.z = z;
        setX(x);
        setY(y);
    }
    public float[] getXYZ() {
        float[] arr = {getX(),getY(),getZ()};
        return arr;
    }

    @Override
    public String toString() {
        return "Foint3D{" +
                "z=" + z +
                " "+super.toString()+
                '}';
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D = new Point2D(2.2f,3.3f);
        System.out.println(point2D);
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D = new Point3D(1.1f,2.2f,3.3f);
        System.out.println(point3D);

    }
}
