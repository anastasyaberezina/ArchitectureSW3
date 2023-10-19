public class Cube implements Shape, Shape3D {

    private int lengthEdge;

    public Cube(int lengthEdge) { this.lengthEdge = lengthEdge; }

    @Override
    public double area() { return lengthEdge * lengthEdge * 6; }

    public int getLengthEdge() { return lengthEdge; }

    public void setLengthEdge(int lengthEdge) { this.lengthEdge = lengthEdge; }

    @Override
    public double volume(){
        return Math.pow(lengthEdge, 3);
    }
    
}
