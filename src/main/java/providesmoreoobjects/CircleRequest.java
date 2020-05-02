package providesmoreoobjects;

import com.google.inject.Inject;
import javax.inject.Named;

public class CircleRequest {

    private DrawShape d;

    @Inject
    public CircleRequest(@Named("Circle") DrawShape d) {
        this.d = d;
    }

    public void makeRequest() {
        d.draw();
    }

    public DrawShape getDrawShape() {
        return d;
    }
}
