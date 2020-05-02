package providingobjectsatruntime;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ShapeRequest {

    private Map<Shape, DrawShape> shapes;

    @Inject
    public ShapeRequest(Set<DrawShape> shapeSet) {
        shapes = new HashMap<>();
        for(DrawShape shape: shapeSet) {
            shapes.put(shape.getShape(), shape);
        }
    }

    public void makeRequest(Shape shape){
        shapes.get(shape).draw();
    }
}
