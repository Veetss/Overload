public class Main {
    public static void main(String[] args) {
        Shape circle = new Shape(5.5);
        Shape square = new Shape(4, 5.7);
        Shape rectangle = new Shape(4, 5.8, 10.9);
        Shape triangle = new Shape(3, 5.6, 5.9, 6.6);
        Shape undefined = new Shape();

        String circleVar = circle.getShapeDetails();
        String squareVar = square.getShapeDetails();
        String rectangleVar = rectangle.getShapeDetails();
        String triangleVar = triangle.getShapeDetails();
        String undefinedVar = undefined.getShapeDetails();

        System.out.println(circleVar);
        System.out.println(squareVar);
        System.out.println(rectangleVar);
        System.out.println(triangleVar);
        System.out.println(undefinedVar);
    }
}
