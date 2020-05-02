package injectprovider;

import com.google.inject.Inject;

public class DrawSquare implements DrawShape {

    private String color;
    private Integer edge;
    private Thread t;

    @Inject
    public DrawSquare(@SquareColorValue String color, @SquareEdgeValue Integer edge) {
        this.color = color;
        this.edge = edge;

        t = new Thread(
            () -> System.out
                .println("Drawing Square " + "color: " + this.color + " edge: " + this.edge));
    }

    public void draw() {
        t.start();
    }
}
