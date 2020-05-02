package providesmoreoobjects;

public class DrawSquare implements DrawShape {

    private String color;
    private Integer edge;

    public DrawSquare(String color, Integer edge) {
        this.color = color;
        this.edge = edge;
    }

    public void draw() {
        System.out.println("Drawing Square " + "color: " + color + " edge: " + edge);
    }
}
