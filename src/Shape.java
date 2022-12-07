public class Shape {
    public String shapeName;
    public int numberOfEdges;

    public Shape(){
        System.out.println("Creating of a shape ");
        this.shapeName = null;
    }

    public Shape(double radius){
        this.shapeName = "Circle";
        System.out.println(shapeName + " creation in progress...");
    }
    public Shape(int edges, double edgeLenght){
        this.shapeName = "Square";
        this.numberOfEdges = edges;
        System.out.println(shapeName + " creation in progress...");
    }
    public Shape(int edges, double e1, double e2){
        this.shapeName = "Rectangle";
        this.numberOfEdges = edges;
        System.out.println(shapeName + " creation in progress...");
    }
    public Shape(int edges, double e1, double e2, double e3){
        this.shapeName = "Triangle";
        this.numberOfEdges = edges;
        System.out.println(shapeName + " creation in progress...");
    }

    public String getShapeDetails(){
        return "The " + shapeName + " has " + numberOfEdges + " number of edges!";
    }
}
