package injectprovider;

import com.google.inject.Inject;
import providerswithcomplexobjects.DrawShape;

public class DrawCircle implements DrawShape {

    private String color;
    private Integer radius;
    private Thread t;

    @Inject
    public DrawCircle(@CircleColorValue String color, @CircleRadiusValue Integer radius) {
        this.color = color;
        this.radius = radius;

        t = new Thread(() -> System.out
            .println("Drawing Circle " + "color: " + this.color + " edge: " + this.radius));
    }

    public void draw() {
        t.start();
    }
}
