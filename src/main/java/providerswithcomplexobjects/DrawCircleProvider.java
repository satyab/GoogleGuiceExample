package providerswithcomplexobjects;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class DrawCircleProvider implements Provider<DrawCircle> {

    private String color;
    private Integer radius;

    @Inject
    public DrawCircleProvider(@CircleColorValue String color, @CircleRadiusValue Integer radius) {
        this.color = color;
        this.radius = radius;
    }

    public DrawCircle get() {
        return new DrawCircle(color, radius);
    }
}
