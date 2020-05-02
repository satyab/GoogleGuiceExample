package googleguicesingleton;

import com.google.inject.Inject;

public class DrawSquare implements DrawShape {

    private String color;
    private Integer edge;

    @Inject
    public DrawSquare(@ColorValue String color, @EdgeValue Integer edge) {
        this.color = color;
        this.edge = edge;
    }

    public void draw() {
        System.out.println("Drawing Square " + " color: " + color + " edge: " + edge);
    }
}
