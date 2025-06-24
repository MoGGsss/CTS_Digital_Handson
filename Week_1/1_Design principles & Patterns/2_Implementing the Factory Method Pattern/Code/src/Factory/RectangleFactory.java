package Factory;

public class RectangleFactory extends ShapeFactory {
    public Shape createShape() {
        return new Rectangle();
    }
}