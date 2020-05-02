package namedannotations;

import javax.inject.Inject;
import javax.inject.Named;

public class SquareRequest {

    private DrawShape d;

    @Inject
    public SquareRequest(@Named("Square") DrawShape d) {
        this.d = d;
    }

    public void makeRequest() {
        d.draw();
    }
}
