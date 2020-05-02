package providerswithcomplexobjects;

import com.google.inject.Inject;

public class CircleRequest {

    private DrawShape d;

    @Inject
    public CircleRequest(@Circle DrawShape d) {
        this.d = d;
    }

    public void makeRequest() {
        d.draw();
    }

    public DrawShape getDrawShape() {
        return d;
    }
}
