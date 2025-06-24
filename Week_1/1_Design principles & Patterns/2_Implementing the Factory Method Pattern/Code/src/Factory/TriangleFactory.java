package Factory;

public class TriangleFactory extends ShapeFactory {
    public Shape createShape() {
        return new Triangle();
    }
}
