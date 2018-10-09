public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{

    public ComparableCircle(){};

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(ComparableCircle compareableCircle) {
        if(this.getRadius()>compareableCircle.getRadius()){
            return 1;
        }else if(this.getRadius()<compareableCircle.getRadius()){
            return -1;
        }else{
            return 0;
        }
    }

    @Override
    public String toString(){
        return "Circle-> radius: "+this.getRadius();
    }
}
