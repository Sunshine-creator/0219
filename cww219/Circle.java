package cww219;
public class Circle extends GeometricObject {
    private double radius;
    public Circle() {
    }
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return  radius * radius *Math.PI;
    }
    public  double getDiameter(){
        return 2* radius;
    }
    public double getPerimetere(){
        return  2* radius * Math.PI;
    }
    public void printCircle(){
        System.out.println("The circle is created" + getDateCreated()+
                "and the radius is :" +radius);
    }

}
