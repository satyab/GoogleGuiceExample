package namedannotations;

import javax.inject.Inject;
import javax.inject.Named;

public class CircleRequest {

    @Inject
    @Named("Circle")
    DrawShape d;

    public void makeRequest() {
        d.draw();
    }

}
