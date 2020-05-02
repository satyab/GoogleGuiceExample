package providingobjectsatruntime;


public class DrawSquare implements DrawShape {

    public void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    public Shape getShape() {
        return Shape.SQUARE;
    }
}
