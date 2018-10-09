public class Circle {
    protected double radius;

    public Circle(){};

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    //@Override
    public String toSstring(){
        return "Circle-> radius: "+this.getRadius();
    }

}
