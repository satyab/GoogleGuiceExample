package providerswithcomplexobjects;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class DrawSquareProvider implements Provider<DrawSquare> {

    private String color;
    private Integer edge;

    @Inject
    public DrawSquareProvider(@SquareColorValue String color, @SquareEdgeValue Integer edge) {
        this.color = color;
        this.edge = edge;
    }

    public DrawSquare get() {
        return new DrawSquare(color, edge);
    }
}
