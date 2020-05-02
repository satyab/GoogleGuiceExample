package providingobjectsatruntime;


public class DrawCircle implements DrawShape {

    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public Shape getShape() {
        return Shape.CIRCLE;
    }
}
