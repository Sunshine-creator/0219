package cww219;
public class Rectangle extends GeometricObject {
    private  double width;
    private  double height;
    public Rectangle() {
    }
    public Rectangle(double length,double height ) {
        this.length = length;
        this.height= height;
    }

    public Rectangle(String color, boolean filled, double height,double width) {
        super(color, filled);
        this.height = height;
        this.width= width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return  width * height;
    }
    public  double getPerimeter(){
        return  2 * (width+height);
    }
}
